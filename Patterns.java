//
//  Class author:  Ryan K
//  Date created:  11/6/25
//  General description: The program Will print out different patterns using letters and symbols
//
public class Patterns {
    public static void main(String[] args) {
        System.out.println("Stars Pattern (7 rows):");
        stars(7);
        System.out.println();


        System.out.println("Triangle Pattern (9 rows):");
        triangle(9);
        System.out.println();


        System.out.println("Odds Pattern (start = 9):");
        odds(9);
        System.out.println();


        System.out.println("EO Pattern (maxE = 6):");
        eo(6);
        System.out.println();


        System.out.println("EO Pattern (maxE = 5):");
        eo(5);
        System.out.println();


        System.out.println("Pyramid Pattern (5 rows):");
        pyramid(5);
        System.out.println();
    }

    //
    //  Pre-condition: rows is a positive value
    //  Post-condition: prints a star pattern with 1, 3, 5, and so on stars up to the determined number of rows
    //
    public static void stars(int rows){
        int i = 1;
        while (i <= rows) {
            int j = 1;
        while (j <= 2 * i - 1) {
            System.out.print("*");
            j++;
    }
        System.out.println();
        i++;
    }
    }

    //
    //  Pre-condition: rows is a positive value
    //  Post-condition: prints a triangle where each line i contains the digit i repeated i times
    //
    public static void triangle(int rows){
        int i = 1;
        do {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        } while (i <= rows);
    }

    //
    //  Pre-condition: start is a positive and odd number
    /* Post-condition: prints a pattern where each line uses the current odd number, 
    starting from start and decreasing by 2, repeating the number as many times as its 
    value
    */
    //
    public static void odds(int start){
        for (int i = start; i >= 1; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
    }
    }

    //
    //  Pre-condition: maxE is a positive value
    //  Post-condition: prints patterns of E and O that increases to maxE lines and then decreases
    //
    public static void eo(int maxE){
        int i = 1;
        while (i <= maxE) {
            char letter = 'O';
            if (i % 2 != 0) {
                letter = 'E';
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println();
            i++;
        }
        i = maxE - 1;
        while (i >= 1) {
            char letter = 'O';
            if (i % 2 != 0) {
                letter = 'E';
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println();
            i--;
        }
    }

    //
    //  Pre-condition: rows is a positive value
    //  Post-condition: prints an inverted number pyramid with each row having spaces between them
    //
    public static void pyramid(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * (rows - i) + 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
