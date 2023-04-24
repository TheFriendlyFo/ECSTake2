package jade;

import util.Time;

import javax.swing.JFrame;
public class Window extends JFrame implements Runnable {

    private static Window window;
    private boolean isRunning = true;
    public Window() {
        setSize(1280, 720);
        setTitle("Game Thingy");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static Window getWindow() {
        if (window == null) {
            window = new Window();
        }

        return window;
    }

    @Override
    public void run() {
        double lastFrameTime = 0.0;
        try {
            while (isRunning) {
                double time = Time.getTime();
                double deltaTime = time - lastFrameTime;
                lastFrameTime = time;

                update(deltaTime);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(double dt) {
        System.out.println(dt);
    }
    public void init() {
    }
}
