import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char A1;
        char A2;
        char A3;
        char B1;
        char B2;
        char B3;
        char C1;
        char C2;
        char C3;

        char[][] gameBoard = {
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '}
                             };

        System.out.println("X, Make a selection of 1-9 on the board");
        Scanner xInput = new Scanner(System.in);
        int xChoice = xInput.nextInt();

        switch (xChoice) {
            case 1:
                gameBoard[0][0] = 'X';
            break;
            case 2:
                gameBoard[0][2] = 'X';
            break;
            case 3:
                gameBoard[0][4] = 'X';
            break;
            case 4:
                gameBoard[2][0] = 'X';
            break;
            case 5:
                gameBoard[2][2] = 'X';
            break;
            case 6:
                gameBoard[2][4] = 'X';
            break;
            case 7:
                gameBoard[4][0] = 'X';
            break;
            case 8:
                gameBoard[4][2] = 'X';
            break;
            case 9:
                gameBoard[4][4] = 'X';
            break;
        }

        printGameBoard(gameBoard);

    }

         public static void printGameBoard(char[][] gameBoard) {
             for(char[] row : gameBoard) {
                for(char c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

};







