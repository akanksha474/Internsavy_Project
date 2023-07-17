package Internsavy_Project;
import java.util.Scanner;

public class TicTacToeGame {
    private char[][] board;
    private char currentPlayer;
    private boolean gameEnded;

    public TicTacToeGame() {
        board = new char[4][4];
        currentPlayer = 'X';
        gameEnded = false;
        initializeBoard();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe Game");
        System.out.println("Player X goes first.");

        while (!gameEnded) {
            displayBoard();

            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);

                if (checkWin(currentPlayer)) {
                    gameEnded = true;
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                } else if (isBoardFull()) {
                    gameEnded = true;
                    displayBoard();
                    System.out.println("It's a draw!");
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    private void initializeBoard() {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    private void displayBoard() {
        System.out.println("-------------");
        for (int row = 1; row <=3; row++) {
            System.out.print("| ");
            for (int col = 1; col <= 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private boolean isValidMove(int row, int col) {
        return (row >= 1 && row <=3 && col >= 1 && col <=3 && board[row][col] == ' ');
    }

    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private boolean checkWin(char player) {
        // Check rows
        for (int row = 1; row <= 3; row++) {
            if (board[row][1] == player && board[row][2] == player && board[row][3] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 1; col <=3; col++) {
            if (board[1][col] == player && board[2][col] == player && board[3][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[1][1] == player && board[2][2] == player && board[3][3] == player) {
            return true;
        }
        if (board[1][3] == player && board[2][2] == player && board[3][1] == player) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.play();
    }
}

