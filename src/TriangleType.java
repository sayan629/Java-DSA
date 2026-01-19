import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 Sides:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
         if(a<b+c && b<a+c && c<a+b ){
             if(a==b && b==c) {
                 System.out.println("Equilateral Triangle");
             }
                 else if(a == b || b == c || a == c) {
                 System.out.println("Isosceles Triangle");
             }
                else{
                 System.out.println("Scalene Triangle");
             }

         }
         else{
             System.out.println("Can not possible  to create Triangle");
         }

    }
}
