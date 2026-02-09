import java.util.Scanner;

public class SumUsingFunction {

    public static void main(String[] args) {
        sum();
        sum();
        sum();
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1= sc.nextInt();
        System.out.print("Enter Number 2: ");
        int n2= sc.nextInt();

        int sum=n1+n2;
        System.out.println("Sum is="+sum);

    }
}
