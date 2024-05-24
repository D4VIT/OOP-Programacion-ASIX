import javax.swing.*;
import java.awt.*;

public class Aplicaciorobot extends JFrame {
    private Robot robot;

    public Aplicaciorobot() {
        super("Robot Aplicacio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);
        setLocationRelativeTo(null);

        robot = new Robot();
    }
}