package StarFighter;

import java.awt.Graphics;

public abstract class MovingThing implements Moveable {
    private int x;
    private int y;
    private int width;
    private int height;

    public MovingThing() {
        this(10, 10); // Default position
    }

    public MovingThing(int x, int y) {
        this(x, y, 10, 10); // Default size
    }

    public MovingThing(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void move(String direction);
    public abstract void draw(Graphics window);

    public String toString() {
        return "pos (" + x + ", " + y + ") size (" + width + ", " + height + ")";
    }
}
