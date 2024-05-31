import javax.swing.*;
import java.awt.*;

public class TicTacToeGUI extends JFrame {
    private Container pane;
    private String currentPlayer;
    private Jbutton [][] board;
    private boolean hasWinner;
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
        board = new Jbutton[3][3];
        hasWinner = false;
        initializeBoard();
        initializeMenuBar();

    }

    private void initializeMenuBar(){
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menuBar.add(menu);
        quit = new JMenuItem("Quit");
        menu.add(quit);
        newGame = new JMenuItem("New Game");
        menu.add(newGame);

    }

    private void resetBoard(){

    }

    private void initializeBoard(){}
    private void togglePlayer(){}
    private void hasWinner(){
        if (board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
        else if (board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player [" + currentPlayer + "] wins!");
            hasWinner = true;
        }
    }


}
