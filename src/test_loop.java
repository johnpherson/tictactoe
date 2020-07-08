
public class test_loop {
    public static void main(String[] args) {

        char[][] names = {{'J', 'O', 'H', 'N'},
                         {'D', 'A', 'V', 'E'}};

        printNames(names);
    }

        public static void printNames(char[][] names) {
            for (char[] row : names) {
                for (char n : row) {
                    System.out.println(n);
                }
                System.out.println();
            }
        }
    }

//
// for(char [] row: gameBoard){   //loops through each row in the gameboard
//         for(char c: row){           //loops through each character in the current row
//         System.out.print(c);      //prints out the current character in the current row
//         }
//         System.out.println();       //creates a new line after all characters in a row have been printed
//         }
