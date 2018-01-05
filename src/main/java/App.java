import models.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        TicTacToe newGame = new TicTacToe();
//        newGame.placeSymbol(0, 2); // X
//        newGame.changePlayer();
//
//        newGame.placeSymbol(1, 2); // O
//        newGame.changePlayer();
//
//        newGame.placeSymbol(0, 1); // X
//        newGame.changePlayer();
//
//        newGame.placeSymbol(1, 1); // O
//        newGame.changePlayer();
//
//        newGame.placeSymbol(0, 0); // X

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (!newGame.isBoardFull()) {
                System.out.println("Player X please enter the row #.");
                int userXRowInput = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Player X please enter the col #.");
                int userXColInput = Integer.parseInt(bufferedReader.readLine());

                newGame.placeSymbol(userXRowInput, userXColInput);
                newGame.printBoard();

                if (newGame.winConditions()) {
                    System.out.println("We have a winner! Congrats!");
                    System.exit(0);
                } else if (newGame.isBoardFull()) {
                    System.out.println("Appears we have a draw!");
                    System.exit(0);
                }

                if (newGame.getCurrentPlayerSymbol() == 'X') {
                    newGame.changePlayer('O');
                }

                System.out.println("Player O please enter the row #.");
                int userORowInput = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Player O please enter the col #.");
                int userOColInput = Integer.parseInt(bufferedReader.readLine());
                newGame.placeSymbol(userORowInput, userOColInput);
                newGame.printBoard();

                if (newGame.winConditions()) {
                    System.out.println("We have a winner! Congrats!");
                    System.exit(0);
                } else if (newGame.isBoardFull()) {
                    System.out.println("Appears we have a draw!");
                    System.exit(0);
                }

                if (newGame.getCurrentPlayerSymbol() == 'X') {
                    newGame.changePlayer('O');
                } else {
                    newGame.changePlayer('X');
                }

            }




//            while (!newGame.isBoardFull()) {
//                System.out.println("Player X please enter the row #.");
//                int userXRowInput = Integer.parseInt(bufferedReader.readLine());
//
//                System.out.println("Player X please enter the col #.");
//                int userXColInput = Integer.parseInt(bufferedReader.readLine());
//
//                newGame.placeSymbol(userXRowInput, userXColInput);
//                newGame.printBoard();
//
//                if (newGame.winConditions()) {
//                    System.out.println("We have a winner! Congrats!");
//                    System.exit(0);
//                } else if (newGame.isBoardFull()) {
//                    System.out.println("Appears we have a draw!");
//                    System.exit(0);
//                }
//               newGame.changePlayer();
//
//                System.out.println("Player O please enter the row #.");
//                int userORowInput = Integer.parseInt(bufferedReader.readLine());
//
//                System.out.println("Player O please enter the col #.");
//                int userOColInput = Integer.parseInt(bufferedReader.readLine());
//                newGame.placeSymbol(userORowInput, userOColInput);
//                newGame.printBoard();
//
//                if (newGame.winConditions()) {
//                    System.out.println("We have a winner! Congrats!");
//                    System.exit(0);
//                } else if (newGame.isBoardFull()) {
//                    System.out.println("Appears we have a draw!");
//                    System.exit(0);
//                }
//                newGame.changePlayer();
//
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }




//        newGame.changePlayer();

    }
}
