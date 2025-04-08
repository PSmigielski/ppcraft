package org.ppcraft.engine.scene;

import lombok.Getter;
import org.ppcraft.engine.graph.Mesh;

import java.util.HashMap;
import java.util.Map;

public class Scene {
    @Getter
    private Map<String, Mesh> meshMap;

    @Getter
    private Projection projection;

    public Scene(int width, int height) {
        meshMap = new HashMap<>() {};
        projection = new Projection(width, height);
    }

    public void addMesh(String meshId, Mesh mesh) {
        meshMap.put(meshId, mesh);
    }

    public void cleanup() {
        meshMap.values().forEach(Mesh::cleanup);
    }
    public void resize(int width, int height) {
        projection.updateProjMatrix(width, height);
    }
}