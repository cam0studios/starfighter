package StarFighter;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ship extends MovingThing {
    private int speed;
    private Image image;

    public Ship() {
        this(0, 0); // default position
    }

    public Ship(int x, int y) {
        this(x, y, 1); // default speed
    }

    public Ship(int x, int y, int s) {
        this(x, y, 50, 50, s);
    }

    public Ship(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("/StarFighter/images/ship.png");
            image = ImageIO.read(url);
        } catch (Exception err) {
            // err.printStackTrace();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(String direction) {
        /* TODO: Ship movement */
        if (direction.equals("LEFT")) {
            setX(getX() - getSpeed());
        }
        /* ... */
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public String toString() {
        return super.toString() + " speed " + getSpeed();
    }
}
