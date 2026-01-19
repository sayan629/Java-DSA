import java.util.Scanner;
public class SingleDigitProd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n = sc.nextInt();
        int prod;

        while (n > 9) {
            prod = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    prod = prod * digit;
                }
                n=n/10;
            }
            n=prod;
        }
        System.out.println("Single Digit Number:"+n);
    }
}
