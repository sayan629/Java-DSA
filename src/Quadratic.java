//write a java program to find the roots of a Quadratic equation. //

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Coefficient a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        if(a==0){
            System.out.println("Error:'a' cannot be zero. This is a Linear Equation.\n");
            sc.close();
            return;
        }

        double discriminat= b * b - 4 * a *c;

        if(discriminat>0){
            double root1=(-b+Math.sqrt(discriminat))/(2*a);
            double root2=(-b-Math.sqrt(discriminat))/(2*a);
            System.out.println("Roots are Real and Different");
            System.out.println("Root 1 = " +root1);
            System.out.println("Root 2 = " +root2);
        }
        else if(discriminat==0){
            double root= -b/(2*a);
            System.out.println("Roots are Real and Equal:");
            System.out.println("Root = "+root);
        }
        else{
            double realPart = -b/(2*a);
            double imaginaryPart=Math.sqrt(-discriminat)/(2*a);
            System.out.println("Roots are Complex (non-real):");
            System.out.printf("Root 1 = %.3f + %.3fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2 = %.3f - %.3fi%n", realPart, imaginaryPart);
        }

    sc.close();
    }

}
