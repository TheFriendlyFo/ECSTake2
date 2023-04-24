package jade;

import java.awt.event.MouseAdapter;

public class MouseListener extends MouseAdapter {

    public boolean mousePressed = false;
    public boolean mouseDragged = false;
    public float x = -1.0f, y = -1.0f;
    public float dx = -1.0f, dy = -1.0f;
}
