package org.ppcraft.game;

import org.ppcraft.engine.*;
import org.ppcraft.engine.graph.Mesh;
import org.ppcraft.engine.graph.Render;
import org.ppcraft.engine.scene.Scene;

public class Main implements IAppLogic {

    public static void main(String[] args) {
        Main main = new Main();
        Engine gameEng = new Engine("O I I A I", new Window.WindowOptions(), main);
        gameEng.start();
    }

    @Override
    public void cleanup() {

    }

    @Override
    public void init(Window window, Scene scene, Render render) {
        float[] positions = new float[]{
                -0.5f, 0.5f, -1.0f,
                -0.5f, -0.5f, -1.0f,
                0.5f, -0.5f, -1.0f,
                0.5f, 0.5f, -1.0f,
        };
        float[] colors = new float[]{
                0.5f, 0.0f, 0.0f,
                0.0f, 0.5f, 0.0f,
                0.0f, 0.0f, 0.5f,
                0.0f, 0.5f, 0.5f,
        };
        int[] indices = new int[]{
                0, 1, 3, 3, 1, 2,
        };
        Mesh mesh = new Mesh(positions, colors, indices);
        scene.addMesh("quad", mesh);
    }

    @Override
    public void input(Window window, Scene scene, long diffTimeMillis) {

    }

    @Override
    public void update(Window window, Scene scene, long diffTimeMillis) {

    }
}