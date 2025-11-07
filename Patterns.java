//
//  Class author:  Ryan
//  Date created:  11/6/25
//  General description: a brief summary of what this particular class does.
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
    //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
    //  Post-condition: what the result of executing this method will be.
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
    //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
    //  Post-condition: what the result of executing this method will be.
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
    //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
    //  Post-condition: what the result of executing this method will be.
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
    //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
    //  Post-condition: what the result of executing this method will be.
    //
    public static void eo(int maxE){
        int i = 1;
        while (i <= maxE) {
            char symbol = 'O';
            if (i % 2 != 0) {
                symbol = 'E';
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            i++;
        }
        i = maxE - 1;
        while (i >= 1) {
            char symbol = 'O';
            if (i % 2 != 0) {
                symbol = 'E';
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            i--;
        }
    }

    //
    //  Pre-condition: what must be true prior to the method being called //  including possible limitations on input
    //  Post-condition: what the result of executing this method will be.
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
