import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius, volume,area;
        System.out.print("Enter the Radius of Sphere: ");
        radius= sc.nextDouble();

        volume= (4.0/3.0) * Math.PI * radius * radius * radius;
        area= 4 * Math.PI * radius * radius;

        // Print sphere results with 2 decimal precision for readability

        System.out.printf(" The Volume of Sphere =%.2f\n " ,volume);
        System.out.printf("The Surface Area of Sphere = %.2f\n" ,area);
        sc.close();
    }
}
