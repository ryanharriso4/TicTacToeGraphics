import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWin extends JFrame {
    private JLabel display;
    TicTacToe board = new TicTacToe(300);

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private int turn = 1;

    public MainWin(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getBoxSize() * 3, board.getBoxSize() * 3);

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem aNew = new JMenuItem("New Game");

        aNew.addActionListener(event -> onNewClick());

        file.add(aNew);
        menubar.add(file);
        setJMenuBar(menubar);

        // Game Board
        JPanel game = new JPanel();
        game.setLayout(new GridLayout(3, 3));

        button1 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button1.addActionListener(event -> onChooseClick(1));
        button2 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button2.addActionListener(event -> onChooseClick(2));
        button3 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button3.addActionListener(event -> onChooseClick(3));
        button4 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button4.addActionListener(event -> onChooseClick(4));
        button5 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button5.addActionListener(event -> onChooseClick(5));
        button6 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button6.addActionListener(event -> onChooseClick(6));
        button7 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button7.addActionListener(event -> onChooseClick(7));
        button8 = new JButton(new ImageIcon("Icons/NullIcon.png"));
        button8.addActionListener(event -> onChooseClick(8));
        button9 = new JButton(new ImageIcon("Icons/NullIcon.png"));
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
        ImageIcon icon;
        char mark;
        if (turn % 2 == 1) {
            icon = new ImageIcon("Icons/XIcon.png");
            mark = 'x';
        }

        else {
            icon = new ImageIcon("Icons/OIcon.png");
            mark = 'o';
        }

        switch (buttonNum) {
            case 1:
                try {
                    board.setBox(1, mark);
                    button1.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 2:
                try {
                    board.setBox(2, mark);
                    button2.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 3:
                try {
                    board.setBox(3, mark);
                    button3.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 4:
                try {
                    board.setBox(4, mark);
                    button4.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 5:
                try {
                    board.setBox(5, mark);
                    button5.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 6:
                try {
                    board.setBox(6, mark);
                    button6.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 7:
                try {
                    board.setBox(7, mark);
                    button7.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 8:
                try {
                    board.setBox(8, mark);
                    button8.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
            case 9:
                try {
                    board.setBox(9, mark);
                    button9.setIcon(icon);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "The box you chose is already checked. Please chose another box.");
                }
                break;
        }
        if (board.checkBoard() == 1) {
            if (turn % 2 == 1)
                JOptionPane.showMessageDialog(this, "Player one has won the game");
            else
                JOptionPane.showMessageDialog(this, "Player two has won the game");
        }
        turn++;
    }

    protected void onNewClick() {
        board = new TicTacToe(board.getBoxSize());
        turn = 1;
        button1.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button2.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button3.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button4.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button5.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button6.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button7.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button8.setIcon(new ImageIcon("Icons/NullIcon.png"));
        button9.setIcon(new ImageIcon("Icons/NullIcon.png"));
    }
}
