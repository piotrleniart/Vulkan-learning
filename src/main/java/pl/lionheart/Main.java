package pl.lionheart;

import org.tinylog.Logger;
import pl.lionheart.engine.*;
import pl.lionheart.engine.graph.Render;
import pl.lionheart.engine.scene.Scene;

public class Main implements IAppLogic {

    public static void main(String[] args) {
        Logger.info("Starting application");
        Engine engine = new Engine("Vulkan Book", new Main());
        engine.start();
    }

    @Override
    public void cleanup() {
        // To be implemented
    }

    @Override
    public void init(Window window, Scene scene, Render render) {
        // To be implemented
    }

    @Override
    public void input(Window window, Scene scene, long diffTimeMillis) {
        // To be implemented
    }

    @Override
    public void update(Window window, Scene scene, long diffTimeMillis) {
        // To be implemented
    }
}