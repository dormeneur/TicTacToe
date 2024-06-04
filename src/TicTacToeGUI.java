import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame {
    private Container pane;
    private String currentPlayer;
    private JButton [][] board;
    private Boolean hasWinner;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;

    public TicTacToeGUI() {
        super();
        pane = getContentPane();
        pane.setLayout(new GridLayout(3,3));
        setTitle("Tic-Tac-Toe");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        currentPlayer = "X";
        board = new JButton[3][3];
        hasWinner = false;
        initializeBoard();
        initializeMenuBar();

    }


    // -------------------------------------
    // Functions
    // -----------------------------

    private void initializeMenuBar(){

        // adding the "File" tab on the top
        menuBar = new JMenuBar();
        menu = new JMenu("File");

        // adding the "Quit" tab
        quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // adding the "New Game" tab
        newGame = new JMenuItem("New Game");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBoard();
            }
        });

        menu.add(newGame);
        menu.add(quit);
        menuBar.add(menu);
        setJMenuBar(menuBar);

    }

    private void resetBoard(){
        currentPlayer = "X";
        hasWinner = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j].setText("");
            }
        }

    }

    private void initializeBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton btn = new JButton("");
                btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
                board[i][j] = btn;
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (((JButton)e.getSource()).getText().equals("") && (!hasWinner)) {
                            btn.setText(currentPlayer);
                            hasWinner();
                            togglePlayer();
                        }
                    }
                });
                pane.add(btn);
            }
        }
    }

    private void togglePlayer(){
        if (currentPlayer.equals("X"))
            currentPlayer = "O";
        else
            currentPlayer = "X";
    }

    private void hasWinner(){

        // Col 1
        if (board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Col 2
        else if (board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Col 3
        else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Row 1
        else if (board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Row 2
        else if (board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Row 3
        else if (board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Dig 00 to 22
        else if (board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }

        // Dig
        else if (board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
            hasWinner = true;
            resetBoard();
        }
    }


}
