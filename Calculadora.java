import javax.swing.*;

class Finestra {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JTextField pantallita = new JTextField();
        JButton[] numericButtons = new JButton[10];

        for (int i = 0; i < numericButtons.length; i++) {
            numericButtons[i] = new JButton(Integer.toString(i));
        }
        pantallita.setEditable(false);

        frame.add(pantallita);
        for (JButton jButton : numericButtons) {
            frame.add(jButton);
        }
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
