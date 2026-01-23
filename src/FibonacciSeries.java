//Generate Fibonacci Series upto nth term

import java.util.Scanner;

public class FibonacciSeries {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.println("Enter Term: ");
        n= sc.nextInt();

        System.out.println("Fibonacci Seris upto "+n+" term :");
        if(n>=1){
            System.out.print(a+ " ");
        }
        if(n>=2){
            System.out.print(b+ " ");
        }
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
        sc.close();
    }

}
