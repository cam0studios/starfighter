package StarFighter;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
    private Ship ship;
    /* Uncomment once you are ready for this part
     * private Alien alienOne;
     * private Alien alienTwo;
    */
   
    /*
     * Uncomment once you are ready for this part
     * private AlienHorde horde;
     * private Bullets shots;
     */

    private boolean[] keys;
    private BufferedImage back;

    public OuterSpace(JFrame par) {
        setBackground(Color.black);
        keys = new boolean[5];

        /* TODO: Instantiate ship */

        addKeyListener(this);
        new Thread(this).start();

        setVisible(true);
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        // Set up double buffering (rendering off-screen to prevent flickering)
        Graphics2D graphics2d = (Graphics2D) window;
        if (back == null) {
            back = (BufferedImage) (createImage(getWidth(), getHeight()));
        }
        Graphics graphics = back.createGraphics();

        // Draw background
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, 800, 600);
        graphics.setColor(Color.blue);
        graphics.drawString("StarFighter", 25, 50);

        /* TODO: Ship movement (0 = left, 1 = right, 2 = up, 3 = down) */
        if (keys[0]) {
            ship.move("LEFT");
        }
        /* ... */

        /* future: collision detection to see if bullets hit the aliens or the ship */

        ship.draw(graphics);

        graphics2d.drawImage(back, null, 0, 0);
    }

    public void keyPressed(KeyEvent ev) {
        if (ev.getKeyCode() == KeyEvent.VK_LEFT || ev.getKeyCode() == KeyEvent.VK_A) {
            keys[0] = true;
        }
        if (ev.getKeyCode() == KeyEvent.VK_RIGHT || ev.getKeyCode() == KeyEvent.VK_D) {
            keys[1] = true;
        }
        if (ev.getKeyCode() == KeyEvent.VK_UP || ev.getKeyCode() == KeyEvent.VK_W) {
            keys[2] = true;
        }
        if (ev.getKeyCode() == KeyEvent.VK_DOWN || ev.getKeyCode() == KeyEvent.VK_D) {
            keys[3] = true;
        }

        repaint();
    }

    public void keyReleased(KeyEvent ev) {
        if (ev.getKeyCode() == KeyEvent.VK_LEFT || ev.getKeyCode() == KeyEvent.VK_A) {
            keys[0] = false;
        }
        if (ev.getKeyCode() == KeyEvent.VK_RIGHT || ev.getKeyCode() == KeyEvent.VK_D) {
            keys[1] = false;
        }
        if (ev.getKeyCode() == KeyEvent.VK_UP || ev.getKeyCode() == KeyEvent.VK_W) {
            keys[2] = false;
        }
        if (ev.getKeyCode() == KeyEvent.VK_DOWN || ev.getKeyCode() == KeyEvent.VK_D) {
            keys[3] = false;
        }

        repaint();
    }

    public void keyTyped(KeyEvent ev) {
        /* Intentionally left empty */
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(5);
                repaint();
            }
        } catch (Exception err) {

        }
    }
}
