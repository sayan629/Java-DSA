import java.util.Scanner;

public class SwapWithoutThird {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // a) Swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swapping using XOR:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b) Restore using + and -
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter restoring using + and -:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}

