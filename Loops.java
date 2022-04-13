/**
 * Loops
 */
public class Loops {

    public static void main(String[] args) {
        int i = 5;
        while (i < 12) {
            System.out.println("Vrednost broja i je: " + i);
            i = i + 1;
        }

        int j = 2;
        while (j >= -4) {
            System.out.println("Vrednost broja j je: " + j);
            j = j - 1;
        }

        int k = 100;
        while (k < 100) {
            System.out.println("k: " + k);
            k = k + 1;
        }

        /**
         * print all odd numbers between 100 and 200
         */

        do {
            System.out.println("k: " + k);
            k = k + 1;
        } while (k < 100);

        for (int t = 1; t <= 20; t++) {
            System.out.println("t: " + t);
        }

        for (int g = 1; g <= 10; g++) {
            for (int l = 1; l <= 10; l++) {
                System.out.print("(" +g + "," + l + ")    ");
            }
            System.out.println();
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Lada", "NissaN"};
        for (String e : cars) {
            System.out.println(e);
        }    
    
        int[] lotteryNumbers = {32, 3, 33, 5, 13, 15, 34};
        for (int r : lotteryNumbers) {
            System.out.println(r);
        }

    }
}
