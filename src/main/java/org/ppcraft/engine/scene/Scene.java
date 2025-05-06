package org.ppcraft.engine.scene;

import lombok.Getter;
import org.ppcraft.engine.graph.Entity;
import org.ppcraft.engine.graph.Mesh;
import org.ppcraft.engine.graph.Model;

import java.util.HashMap;
import java.util.Map;

public class Scene {
    @Getter
    private Map<String, Model> modelMap;

    @Getter
    private Projection projection;

    public Scene(int width, int height) {
        modelMap = new HashMap<>() {};
        projection = new Projection(width, height);
    }

    public void addEntity(Entity entity) {
        String modelId = entity.getModelId();
        Model model = modelMap.get(modelId);
        if (model == null) {
            throw new RuntimeException("Could not find model [" + modelId + "]");
        }
        model.getEntitiesList().add(entity);
    }

    public void addModel(Model model) {
        modelMap.put(model.getId(), model);
    }

    public void cleanup() {
        modelMap.values().forEach(Model::cleanup);
    }

    public Map<String, Model> getModelMap() {
        return modelMap;
    }

    public Projection getProjection() {
        return projection;
    }

    public void resize(int width, int height) {
        projection.updateProjMatrix(width, height);
    }}