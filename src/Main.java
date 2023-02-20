import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        // Array1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        // Array2
        double[] doubles = {1.57, 7.654, 9.986};
        // Array3
        char[] randomCharacters = new char[5];
        randomCharacters[0] = 'S';
        randomCharacters[1] = 'D';
        randomCharacters[2] = 'V';
        randomCharacters[3] = 'K';
        randomCharacters[4] = 'O';
        // Задача 2
        System.out.println("Задача 2");
        // Array1
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println(" ");
        // Array2
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.println(" ");
        // Array3
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(randomCharacters[i] + ", ");
            } else {
                System.out.print(randomCharacters[i]);
            }
        }
        System.out.println(" ");
        // Задача 3
        System.out.println("Задача 3");
        // Array1
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println(" ");
        // Array2
        for (int k = 2; k >= 0; k--) {
            if (k > 0) {
                System.out.print(doubles[k] + ", ");
            } else {
                System.out.print(doubles[k]);
            }
        }
        System.out.println(" ");
        // Array3
        for (int k = 4; k >= 0; k--) {
            if (k > 0) {
                System.out.print(randomCharacters[k] + ", ");
            } else {
                System.out.print(randomCharacters[k]);
            }
        }
        System.out.println(" ");
        // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}