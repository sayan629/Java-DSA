

import java.util.Scanner;

public class SingleDigitNumber {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int sum = 0;
        int rem = 0;

        while (n > 9) {
            sum = 0;

            while (n > 0) {
                rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            n = sum;
        }

    System.out.println("Single Digit Value is "+n);
}
}


