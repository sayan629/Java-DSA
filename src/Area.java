//Create a class Rectangle with data members Length, Breadth, and methods to Input dimensions
//,Calculate Area, Calculate Perimeter, display_details. Create multiple objects and compare
//which rectangle has the larger area.


import java.util.Scanner;
class Rectangle{
    double length;
    double breadth;
    double perimeter;
    double area;

    public void Input(Scanner sc){
        System.out.print("Enter Length of Rectangle: ");
        length=sc.nextDouble();
        System.out.print("Enter Breadth of Perimeter:");
        breadth=sc.nextDouble();
    }
    void Area(){
        area= length*breadth;

    }
    void Perimeter(){
        perimeter= 2*(length+breadth);
    }
    void Display(){
        System.out.println("-----------Rectangle Details-------------");
        System.out.println("Length is: "+length);
        System.out.println("Breadth is: "+breadth);
        System.out.println("Area is :"+area);
        System.out.println("Perimeter is:"+perimeter);
        System.out.println("------------------------------------------");
    }
}

public class Area {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle s1= new Rectangle();
        s1.Input(sc);
        s1.Area();
        s1.Perimeter();
        s1.Display();

        Rectangle s2= new Rectangle();
        s2.Input(sc);
        s2.Area();
        s2.Perimeter();
        s2.Display();
        sc.close();

        System.out.println("\n ========== Area Comparison ============");
        if(s1.area>s2.area){
            System.out.println("Rectangle 1 has larger area");
        }
        else if(s2.area>s1.area){
            System.out.println("Rectangle 2 has larger area");
        }
        else{
            System.out.println("Both Rectangle has the Same Area");
        }

    }
}
