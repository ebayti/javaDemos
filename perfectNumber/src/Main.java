import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Trying to find the perfect number
        /* A perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding itself. */
        int summation = 0;
        List<Integer> dividends = new ArrayList<>(); // create an ArrayList to store the dividends

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number: ");
        int perfectNumber = scanner.nextInt(); // waits for the integer input

        for (int i = 1; i < perfectNumber; i++) {
            if (perfectNumber % i == 0) {
                dividends.add(i);
                summation = summation + i;
            }
        }
        if (summation == perfectNumber) {
            System.out.println("The given number '" + perfectNumber + "' is a perfect number.");
        } else {
            System.out.println("The given number '" + perfectNumber + "' is not a perfect number.");
        }
        System.out.println("The dividends are :" + dividends + "\nAnd their sum is equal to " + summation);
    }
}