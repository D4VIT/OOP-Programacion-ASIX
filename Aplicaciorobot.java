import javax.swing.*;
import java.awt.*;

public class Aplicaciorobot extends JFrame {
    private static class Robot {
        public void moveForward() {
            System.out.println("Moviendo hacia adelante");
        }

        public void moveBackward() {
            System.out.println("Moviendo hacia atrás");
        }

        public void turnLeft() {
            System.out.println("Girando a la izquierda");
        }

        public void turnRight() {
            System.out.println("Girando a la derecha");
        }
    }

    private Robot robot;

    public Aplicaciorobot() {
        super("Robot Aplicacio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);
        setLocationRelativeTo(null);

        robot = new Robot();

        JButton moveForwardButton = new JButton("Mover Adelante");
        moveForwardButton.addActionListener(e -> robot.moveForward());

        JButton moveBackwardButton = new JButton("Mover Atrás");
        moveBackwardButton.addActionListener(e -> robot.moveBackward());

        JButton turnLeftButton = new JButton("Girar Izquierda");
        turnLeftButton.addActionListener(e -> robot.turnLeft());

        JButton turnRightButton = new JButton("Girar Derecha");
        turnRightButton.addActionListener(e -> robot.turnRight());

        JPanel layout = new JPanel(new GridLayout(4, 1, 10, 10));
        layout.add(moveForwardButton);
        layout.add(moveBackwardButton);
        layout.add(turnLeftButton);
        layout.add(turnRightButton);
        add(layout, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Aplicaciorobot().setVisible(true);
        });
    }
}

