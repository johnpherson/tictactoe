import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Play again?");
        Scanner nInput = new Scanner(System.in);
        int plyAgain = nInput.nextInt();


        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };


        while (plyAgain == 1) {
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

            System.out.println("O, Make a selection of 1-9 on the board");
            Scanner oInput = new Scanner(System.in);
            int oChoice = oInput.nextInt();

            switch (oChoice) {
                case 1:
                    gameBoard[0][0] = 'O';
                    break;
                case 2:
                    gameBoard[0][2] = 'O';
                    break;
                case 3:
                    gameBoard[0][4] = 'O';
                    break;
                case 4:
                    gameBoard[2][0] = 'O';
                    break;
                case 5:
                    gameBoard[2][2] = 'O';
                    break;
                case 6:
                    gameBoard[2][4] = 'O';
                    break;
                case 7:
                    gameBoard[4][0] = 'O';
                    break;
                case 8:
                    gameBoard[4][2] = 'O';
                    break;
                case 9:
                    gameBoard[4][4] = 'O';
                    break;
            }


            printGameBoard(gameBoard);

            if (plyAgain == 0) {
                break;
            }

        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
};







