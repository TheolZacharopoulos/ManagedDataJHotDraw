package ccconcerns.managed_data.schemas.geometry;

import nl.cwi.managed_data_4j.M;

public interface MDDimension extends M {
    Integer width(Integer... width);
    Integer height(Integer... height);
}
