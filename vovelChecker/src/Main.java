import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vowels = "aeiou";
        String numbers = "0123456789";
        String operators = "+-*/%";
        String specialChars = "!'^+%&/()=?>£#$½¾{[]}\\;:.,~<>~|"; // escape backslash '\' with another one.
        int wrongInput = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please type a letter then press ENTER for the check: ");

        while (true) {
            String answer = input.nextLine(); // nextLine waits for string input
            String isItVowel = answer.substring(0, 1);
            
            if (answer.length() == 1 | wrongInput >= 2) {

                if (wrongInput >= 2) {
                    System.out.println("Your output was again longer than expected. For checking, the first char '" + isItVowel + "' will be considered.");
                    wrongInput = 0;
                }

                boolean vowelCondition = vowels.contains(isItVowel.toLowerCase());
                boolean numberCondition = numbers.contains(isItVowel);
                boolean operatorCondition = operators.contains(isItVowel);
                boolean charCondition = specialChars.contains(isItVowel);

                if (vowelCondition) {
                    System.out.println("The letter '" + isItVowel + "' is a vowel.");
                    break;
                } else if (numberCondition) {
                    System.out.println("The given input '" + isItVowel + "' is not a letter, it is a number.\nPlease type a letter then press ENTER:");
                } else if (operatorCondition) {
                    System.out.println("The given input '" + isItVowel + "' is not a letter, it is an operator.\nPlease type a letter then press ENTER:");
                } else if (charCondition) {
                    System.out.println("The given input '" + isItVowel + "' is not a letter, it is a special character.\nPlease type a letter then press ENTER:");
                } else {
                    System.out.println("The letter '" + isItVowel + "' is not a vowel.");
                    break;
                }
            } else {
                if (answer.length() > 1) {
                    System.out.println("Your input was longer than expected. Please type only a letter: ");
                    wrongInput++;
                }
            }

        }
    }
}