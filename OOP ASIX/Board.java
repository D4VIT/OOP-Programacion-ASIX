import javax.awt.event.swing.ActionListener;
import javax.awt.event.ActionListener;
import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener {
    private static int BOARD_WIDHT = 10;
    private static int BOARD_HEIGHT = 30;

    private Tetraminoes[] board;

    public Board() {
        board = new int[BOARD_WIDTH * BOARD_HEIGHT];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fghjk
    }
}
