package jade;

import util.Time;

import javax.swing.JFrame;
public class Window extends JFrame implements Runnable {

    private static Window window;
    public ML mouseListener;
    public KL keyListener;
    private boolean isRunning = true;
    public Window() {
        this.mouseListener = new ML();
        this.keyListener = new KL();

        setSize(1280, 720);
        setTitle("Game Thingy");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
        addKeyListener(keyListener);
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
        System.out.println(mouseListener.mousePressed);
        if (mouseListener.mousePressed) System.out.println("Pressed");
    }
    public void init() {

    }
}
