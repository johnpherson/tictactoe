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
                gameBoard[0] = 'x';
            break;
            case 2:
                gameBoard[1] = 'x';
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







