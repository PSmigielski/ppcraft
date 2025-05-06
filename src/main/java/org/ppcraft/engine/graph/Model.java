package org.ppcraft.engine.graph;
import lombok.Getter;

import java.util.*;
public class Model {
    @Getter
    private final String id;
    @Getter
    private List<Entity> entitiesList;
    @Getter
    private List<Mesh> meshList;

    public Model(String id, List<Mesh> meshList) {
        this.id = id;
        this.meshList = meshList;
        entitiesList = new ArrayList<>();
    }

    public void cleanup() {
        meshList.forEach(Mesh::cleanup);
    }

}
