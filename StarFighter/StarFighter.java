package StarFighter;
import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame {
    public static int WIDTH = 800;
    public static int HEIGHT = 600;

    public StarFighter() {
        super("STARFIGHTER");

        setSize(WIDTH, HEIGHT);

        OuterSpace game = new OuterSpace(this);
        ((Component) game).setFocusable(true);

        getContentPane().add(game);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StarFighter();
    }
}