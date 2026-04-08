package Interface;

interface Shape{
    final double PI=3.14;
    double area();
    double perimeter();
}
class Rectangle implements Shape{
    double l=4,b=3;
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
}
class Circle implements Shape{
    double r=5;
    public double area(){
        return PI*r*r;
    }
    public double perimeter(){
        return 2*PI*r;
    }
}
public class InterfaceTest {
    static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Circle();

        System.out.println("Rectangle Area: "+r.area());
        System.out.println("Rectangle Perimeter: "+r.perimeter());
        System.out.println("Circle Area: "+ c.area());
        System.out.println("Circle Perimeter: "+ c.perimeter());
    }
}
