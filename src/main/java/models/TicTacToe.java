package models;


public class TicTacToe {
    private char[][] board;
    private char currentPlayerSymbol;

    public char getCurrentPlayerSymbol() {
        return this.currentPlayerSymbol;
    }
    public TicTacToe() {
        this.board = new char[3][3];
        this.currentPlayerSymbol = 'X';
        initBoard();
    }

    public void initBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean winConditions() {
//        if (checkRowsForWin() == true) {
//            return true;
//        } else if (checkColsForWin() == true) {
//            return true;
//        } else if (checkDiagonalsForWin() == true) {
//            return true;
//        } else {
//            return false;
//        }
        return (checkRowsForWin() || checkColsForWin() || checkDiagonalsForWin());
    }

    private boolean checkRowsForWin() {
        for (int row = 0; row < 3; row++) {
            if (checkRowCol(board[row][0], board[row][1], board[row][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColsForWin() {
        for (int col = 0; col < 3; col++) {
            if (checkRowCol(board[0][col], board[1][col], board[2][col])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) || (checkRowCol(board[0][2], board[1][1], board[2][0])));
    }

    private boolean checkRowCol (char charOne, char charTwo, char charThree) {
        return ((charOne != '-') && (charOne == charTwo) && (charTwo == charThree));
    }

    public void changePlayer(char symbol) {
        this.currentPlayerSymbol = symbol;
//        if (currentPlayerSymbol == 'X') {
//            currentPlayerSymbol = 'O';
//        } else {
//            currentPlayerSymbol = 'X';
//        }
    }

    public boolean placeSymbol(int row, int col) {
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerSymbol;
                    return true;
                }
            }
        }
        return false;
    }

    public char[][] getBoard() {
        return this.board;
    }
}
