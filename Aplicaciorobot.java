import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aplicaciorobot extends JFrame {
    private static class Robot {
        private List<String> registroMovimientos = new ArrayList<>();
        private JTextArea textArea;

        public void moveForward() {
            System.out.println("Moviendo hacia adelante");
            registroMovimientos.add("Moviendo hacia adelante");
            actualizarTextArea();
        }

        public void moveBackward() {
            System.out.println("Moviendo hacia atrás");
            registroMovimientos.add("Moviendo hacia atrás");
            actualizarTextArea();
        }

        public void turnLeft() {
            System.out.println("Girando a la izquierda");
            registroMovimientos.add("Girando a la izquierda");
            actualizarTextArea();
        }

        public void turnRight() {
            System.out.println("Girando a la derecha");
            registroMovimientos.add("Girando a la derecha");
            actualizarTextArea();
        }

        public void saveMovementLog() {
            try {
                FileWriter writer = new FileWriter("registroMovimientos.txt");
                for (String movimiento : registroMovimientos) {
                    writer.write(movimiento + "\n");
                }
                writer.close();
                System.out.println("Movimientos guardados en el archivo 'registroMovimientos.txt'");
            } catch (IOException e) {
                System.out.println("Error al guardar los movimientos: " + e.getMessage());
            }
        }

        public void setTextArea(JTextArea textArea) {
            this.textArea = textArea;
        }

        private void actualizarTextArea() {
            if (textArea != null) {
                StringBuilder sb = new StringBuilder();
                for (String movimiento : registroMovimientos) {
                    sb.append(movimiento).append("\n");
                }
                textArea.setText(sb.toString());
            }
        }
    }

    private Robot robot;

    public Aplicaciorobot() {
        super("Robot Aplicacio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);
        setLocationRelativeTo(null);

        robot = new Robot();

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        robot.setTextArea(textArea);

        JButton moveForwardButton = new JButton("Mover Adelante");
        moveForwardButton.addActionListener(e -> robot.moveForward());

        JButton moveBackwardButton = new JButton("Mover Atrás");
        moveBackwardButton.addActionListener(e -> robot.moveBackward());

        JButton turnLeftButton = new JButton("Girar Izquierda");
        turnLeftButton.addActionListener(e -> robot.turnLeft());

        JButton turnRightButton = new JButton("Girar Derecha");
        turnRightButton.addActionListener(e -> robot.turnRight());

        JButton saveMovementButton = new JButton("Guardar Movimientos");
        saveMovementButton.addActionListener(e -> robot.saveMovementLog());

        JPanel layout = new JPanel(new GridLayout(6, 1, 10, 10));
        layout.add(moveForwardButton);
        layout.add(moveBackwardButton);
        layout.add(turnLeftButton);
        layout.add(turnRightButton);
        layout.add(saveMovementButton);
        layout.add(textArea);
        add(layout, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Aplicaciorobot().setVisible(true);
        });
    }
}


