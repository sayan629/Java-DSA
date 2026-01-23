import java.util.Scanner;

public class GCD {
    public static void main() {

    int a, b, temp=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();

        while (b != 0) {
        temp = b;
        b = a % b;
        a = temp;
    }

        System.out.println("GCD = " + a);
        sc.close();
}
}