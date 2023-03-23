import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainWin extends JFrame {
    private JLabel display;
    TicTacToe board = new TicTacToe(300);

    public MainWin(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getBoxSize() * 3, board.getBoxSize() * 3);

        JPanel game = new JPanel();
        game.setLayout(new GridLayout(3, 3));

        JButton button1 = new JButton();
        button1.addActionListener(event -> onChooseClick(1));
        JButton button2 = new JButton();
        button2.addActionListener(event -> onChooseClick(2));
        JButton button3 = new JButton();
        button3.addActionListener(event -> onChooseClick(3));
        JButton button4 = new JButton();
        button4.addActionListener(event -> onChooseClick(4));
        JButton button5 = new JButton();
        button5.addActionListener(event -> onChooseClick(5));
        JButton button6 = new JButton();
        button6.addActionListener(event -> onChooseClick(6));
        JButton button7 = new JButton();
        button7.addActionListener(event -> onChooseClick(7));
        JButton button8 = new JButton();
        button8.addActionListener(event -> onChooseClick(8));
        JButton button9 = new JButton();
        button9.addActionListener(event -> onChooseClick(9));

        game.add(button1);
        game.add(button2);
        game.add(button3);
        game.add(button4);
        game.add(button5);
        game.add(button6);
        game.add(button7);
        game.add(button8);
        game.add(button9);
        add(game);
        setVisible(true);
    }

    protected void onChooseClick(int buttonNum) {

    }
}
