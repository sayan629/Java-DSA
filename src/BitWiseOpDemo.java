import java.util.Scanner;

public class BitWiseOpDemo {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int notResult = ~num1;

        System.out.println("\nnum1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("num1 & num2 = " + andResult);
        System.out.println("num1 | num2 = " + orResult);
        System.out.println("num1 ^ num2 = " + xorResult);
        System.out.println("~num1 = " + notResult);

        sc.close();
    }
    }
