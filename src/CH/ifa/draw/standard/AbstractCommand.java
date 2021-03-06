/*
 * @(#)AbstractCommand.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.standard;

import CH.ifa.draw.framework.*;
import CH.ifa.draw.util.Command;
import CH.ifa.draw.util.CommandListener;
import CH.ifa.draw.util.Undoable;
import CH.ifa.draw.util.CollectionsFactory;
import ccconcerns.managed_data.data_managers.SubjectRole.SubjectRole;
import ccconcerns.managed_data.MDDrawingView;

import java.util.*;

/**
 * @author Helge Horch
 * @author Wolfram Kaiser
 * @version <$CURRENT_VERSION$>
 */
public abstract class AbstractCommand implements Command, /* @MDHD FigureSelectionListener, */ ViewChangeListener {

	private String  myName;

	// @MDHD ChangeAttributeCommand Undo Refactoring
	// Not removed: Because not everything is refactored yet
	private Undoable myUndoableActivity;
	private boolean myIsViewRequired;
	private AbstractCommand.EventDispatcher myEventDispatcher;

	/**
	 * the DrawingEditor this command applies to
	 */
	private DrawingEditor myDrawingEditor;

	/**
	 * Constructs a command with the given name that applies to the given view.
	 * @param newName java.lang.String
	 * @param newDrawingEditor the DrawingEditor which manages the views
	 */
	public AbstractCommand(String newName, DrawingEditor newDrawingEditor) {
		this(newName, newDrawingEditor, true);
	}

	public AbstractCommand(String newName, DrawingEditor newDrawingEditor, boolean newIsViewRequired) {
		setName(newName);
		setDrawingEditor(newDrawingEditor);
		getDrawingEditor().addViewChangeListener(this);
		myIsViewRequired = newIsViewRequired;
		setEventDispatcher(createEventDispatcher());
	}

	/**
	 * Sent when a new view is created
	 */
	public void viewCreated(MDDrawingView view) {
	}

	/**
	 * Send when an existing view is about to be destroyed.
	 */
	public void viewDestroying(MDDrawingView view) {
	}

	/**
	 * @param view a DrawingView
	 */
	public void figureSelectionChanged(MDDrawingView view) {
	}

	/**
	 * @return DrawingEditor associated with this command
	 */
	public DrawingEditor getDrawingEditor() {
		return myDrawingEditor;
	}

	private void setDrawingEditor(DrawingEditor newDrawingEditor) {
		myDrawingEditor = newDrawingEditor;
	}

	/**
	 * Convenience method
	 *
	 * @return DrawingView currently active in the editor
	 */
	public MDDrawingView view() {
		return getDrawingEditor().view();
	}

	/**
	 * Gets the command name.
	 */
	public String getName() {
		return myName;
	}

	public void setName(String newName) {
		myName = newName;
	}

	/**
	 * Executes the command.
	 */
	public void execute() {
		if (view() == null) {
			throw new JHotDrawRuntimeException("execute should NOT be getting called when view() == null");
		};
	}

	/**
	 * Tests if the command can be executed. The view must be valid when this is
	 * called. Per default, a command is executable if at
	 * least one figure is selected in the current activated
	 * view.
	 */
	public boolean isExecutable() {
		// test whether there is a view required and whether an existing view
		// accepts user input
		if (isViewRequired()) {
			if ((view() == null) || !view().isInteractive()) {
				return false;
			}
		}
		return isExecutableWithView();
	}

	protected boolean isViewRequired() {
		return myIsViewRequired;
	}

	protected boolean isExecutableWithView() {
		return true;
	}

	// @MDHD ChangeAttributeCommand Undo Refactoring
	// Not removed: Because not everything is refactored yet
	public Undoable getUndoActivity() {
		return myUndoableActivity;
	}

	// @MDHD ChangeAttributeCommand Undo Refactoring
	// Not removed: Because not everything is refactored yet
	public void setUndoActivity(Undoable newUndoableActivity) {
		myUndoableActivity = newUndoableActivity;
	}

	public void addCommandListener(CommandListener newCommandListener) {
		getEventDispatcher().addCommandListener(newCommandListener);
	}

	public void removeCommandListener(CommandListener oldCommandListener) {
		getEventDispatcher().removeCommandListener(oldCommandListener);
	}

	private void setEventDispatcher(AbstractCommand.EventDispatcher newEventDispatcher) {
		myEventDispatcher = newEventDispatcher;
	}

	protected AbstractCommand.EventDispatcher getEventDispatcher() {
		return myEventDispatcher;
	}

	public AbstractCommand.EventDispatcher createEventDispatcher() {
		return new AbstractCommand.EventDispatcher(this);
	}

	public static class EventDispatcher {
		private List myRegisteredListeners;
		private Command myObservedCommand;

		public EventDispatcher(Command newObservedCommand) {
			myRegisteredListeners = CollectionsFactory.current().createList();
			myObservedCommand = newObservedCommand;
		}

		public void fireCommandExecutedEvent() {
			Iterator iter = myRegisteredListeners.iterator();
			while (iter.hasNext()) {
				((CommandListener)iter.next()).commandExecuted(new EventObject(myObservedCommand));
			}
		}

		public void fireCommandExecutableEvent() {
			Iterator iter = myRegisteredListeners.iterator();
			while (iter.hasNext()) {
				((CommandListener)iter.next()).commandExecutable(new EventObject(myObservedCommand));
			}
		}

		public void fireCommandNotExecutableEvent() {
			Iterator iter = myRegisteredListeners.iterator();
			while (iter.hasNext()) {
				((CommandListener)iter.next()).commandNotExecutable(new EventObject(myObservedCommand));
			}
		}

		public void addCommandListener(CommandListener newCommandListener) {
			if (!myRegisteredListeners.contains(newCommandListener)) {
				myRegisteredListeners.add(newCommandListener);
			}
		}

		public void removeCommandListener(CommandListener oldCommandListener) {
			if (myRegisteredListeners.contains(oldCommandListener)) {
				myRegisteredListeners.remove(oldCommandListener);
			}
		}
	}

	// @MDHD: FigureSelectionListener (FSL) Refactoring
	// ===========================================================================================
	// ===========================================================================================
	// ===========================================================================================

	/**
	 * Releases resources associated with this command
	 */
	public void dispose() {
		// @MDHD: FigureSelectionListener (FSL) Refactoring
//		if (view() != null) {
//
//			// view().removeFigureSelectionListener(this);
////			((SubjectRole) view()).removeListener(this);
//		}
	}

	public void viewSelectionChanged(MDDrawingView oldView, MDDrawingView newView) {
		if (isViewRequired()) {
			boolean isOldViewInteractive = (oldView != null) && oldView.isInteractive();
			boolean isNewViewInteractive = (newView != null) && newView.isInteractive();

			// old view was not interactive aware while new view is now interactive aware
			if (!isOldViewInteractive && isNewViewInteractive) {
				getEventDispatcher().fireCommandExecutableEvent();
			}
			// old view was interactive aware while new view is not
			else if (isOldViewInteractive && !isNewViewInteractive) {
				getEventDispatcher().fireCommandNotExecutableEvent();
			}
		}
	}

	// @MDHD: FigureSelectionListener (FSL) Refactoring
//	public void figureSelectionChanged(MDStandardDrawingView view) {}
}