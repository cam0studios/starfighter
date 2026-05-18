package StarFighter;

public interface Moveable {
    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public int getSpeed();
    
    public void setX(int x);
    public void setY(int y);
    public void setWidth(int w);
    public void setHeight(int h);
    public void setSpeed(int s);

    public void setPos(int x, int y);
}
