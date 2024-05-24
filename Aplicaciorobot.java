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

        JButton moveForwardButton = new JButton("Mover Adelante");
        moveForwardButton.addActionListener(e -> robot.moveForward());

        JButton turnLeftButton = new JButton("Mover Izquierda");
        turnLeftButton.addActionListener(e -> robot.turnLeft());

        JButton turnRightButton = new JButton("Mover Derecha");
        turnRightButton.addActionListener(e -> robot.turnRight());
    }
}