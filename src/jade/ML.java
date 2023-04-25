package jade;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ML extends MouseAdapter {
    public boolean mousePressed = false;
    public boolean mouseDragged = false;
    public int mouseButton = -1;
    public float x = -1.0f, y = -1.0f;
    public float dx = -1.0f, dy = -1.0f;

    @Override
    public void mousePressed(MouseEvent e) {
        this.mousePressed = true;
        this.mouseButton = e.getButton();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.mousePressed = false;
        this.mouseDragged = false;
        dx = 0;
        dy = 0;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseDragged = true;
        dx = e.getX() - x;
        dy = e.getY() - y;
    }
}
