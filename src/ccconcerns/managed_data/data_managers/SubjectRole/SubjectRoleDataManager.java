package ccconcerns.managed_data.data_managers.SubjectRole;

import nl.cwi.managed_data_4j.language.IFactory;
import nl.cwi.managed_data_4j.language.data_manager.BasicDataManager;
import nl.cwi.managed_data_4j.language.managed_object.MObject;
import nl.cwi.managed_data_4j.language.schema.models.definition.Klass;
import nl.cwi.managed_data_4j.language.schema.models.definition.Schema;

public class SubjectRoleDataManager extends BasicDataManager {

    @Override
    public <T extends IFactory> T factory(Class<T> moSchemaFactoryClass, Schema schema, Class<?>... proxiedInterfaces) {
        return super.factory(moSchemaFactoryClass, schema, SubjectRole.class);
    }

    @Override
    protected MObject createManagedObject(Klass klass, Object... _inits) {
        return new SubjectRoleMObject(klass, _inits);
    }
}