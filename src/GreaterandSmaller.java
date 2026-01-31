import java.util.Scanner;

public class GreaterandSmaller {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,greater,smaller;
        System.out.print("Enter A and B :");
        a=sc.nextInt();
        b= sc.nextInt();

        greater=(a>b)?a:b;
        smaller=(a<b)?a:b;

        System.out.println("The Greatest Number is: "+greater);
        System.out.println("The Smallest Number is: "+smaller);
        sc.close();

    }
}
