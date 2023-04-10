import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prime number finder //
        /* In Java, Scanner class is used for reading input, .csv and etc.
         Thus I will use Scanner class for getting input. */

        Scanner input = new Scanner(System.in); // Declare the class
        System.out.println("Please type a number then press ENTER for the prime check: ");
        int isItPrime = input.nextInt(); // for reading input info, use nextInt();
        // nextLine() and nextDouble() are other alternatives
/*        int remainder_2 = isItPrime % 2;
        int remainder_3 = isItPrime % 3;*/

        System.out.println("Thanks for the input!\nChecking...\n");


        if (isItPrime < 0) {
            System.out.println(isItPrime + " cannot be a prime number since it's negative.");
        } else {

            if (isItPrime <= 1) {
                System.out.println(isItPrime + " is not a prime number.");
            } else if (isItPrime == 2 || isItPrime == 3) {
                System.out.println(isItPrime + " is a prime number.");
            }
            // Check if the input is divisible by any odd number from 3 to the square root of n. If it is, then it is not a prime number
            boolean prime = false;
            for (int i = 2; i <=Math.sqrt(isItPrime); i++) {
                if (isItPrime % i == 0) {
                    System.out.println(isItPrime + " is not a prime number, it is divisible by "+i);
                    prime = true;
                    break;
                }
            }
            if (!prime) {
                System.out.println(isItPrime + " is a prime number.");
            }

/*            for (int i = 2; i < isItPrime; i++) {
                if (isItPrime % i == 0) {
                    System.out.println("Not a prime");
                    break;
                }
            }*/
        }
    }

}
