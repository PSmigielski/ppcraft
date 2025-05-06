package org.ppcraft.engine.graph;

import lombok.Getter;
import lombok.Setter;
import org.joml.*;


public class Entity {
    @Getter
    private final String id;
    @Getter
    private final String modelId;
    @Getter
    private Matrix4f modelMatrix;
    @Getter
    @Setter
    private Vector3f position;
    @Getter
    @Setter
    private Quaternionf rotation;
    @Getter
    @Setter
    private float scale;

    public Entity(String id, String modelId) {
        this.id = id;
        this.modelId = modelId;
        modelMatrix = new Matrix4f();
        position = new Vector3f();
        rotation = new Quaternionf();
        scale = 1;
    }

    public void updateModelMatrix() {
        modelMatrix.translationRotateScale(position, rotation, scale);
    }
}
