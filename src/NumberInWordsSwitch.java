import java.util.Scanner;

/**
 * Program to display each digit of a number in words
 * using switch-case
 * Example: 5012 -> Five Zero One Two
 */
public class NumberInWordsSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.next();   // Taking as String to preserve leading zeros

        System.out.println("\nNumber in Words:");

        // Loop through each character (digit)
        for (int i = 0; i < number.length(); i++) {

            char digit = number.charAt(i);

            switch (digit) {

                case '0':
                    System.out.print("Zero ");
                    break;

                case '1':
                    System.out.print("One ");
                    break;

                case '2':
                    System.out.print("Two ");
                    break;

                case '3':
                    System.out.print("Three ");
                    break;

                case '4':
                    System.out.print("Four ");
                    break;

                case '5':
                    System.out.print("Five ");
                    break;

                case '6':
                    System.out.print("Six ");
                    break;

                case '7':
                    System.out.print("Seven ");
                    break;

                case '8':
                    System.out.print("Eight ");
                    break;

                case '9':
                    System.out.print("Nine ");
                    break;

                default:
                    System.out.print("Invalid ");
            }
        }

        sc.close();
    }
}
