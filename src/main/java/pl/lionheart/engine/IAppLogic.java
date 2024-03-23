package pl.lionheart.engine;

import pl.lionheart.engine.graph.Render;
import pl.lionheart.engine.scene.Scene;

public interface IAppLogic {

    void cleanup();

    void input(Window window, Scene scene, long diffTimeMillis);

    void init(Window window, Scene scene, Render render);

    void update(Window window, Scene scene, long diffTimeMillis);
}