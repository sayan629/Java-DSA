package Abstraction;

import java.util.Scanner;

abstract class Shape{
    protected double length,breadth,height;

    Shape(double l, double b, double h){
        length=l;
        breadth=b;
        height=h;
    }
    abstract void volume();
    abstract void surfaceArea();
}
class Cube extends Shape{
    Cube(double side){
        super(side,side,side);
    }
    void volume(){
        double v = length * length * length;
        System.out.println("Volume of Cube is: "+v);
    }
    void surfaceArea(){
        double sa= 6*length*length;
        System.out.println("Cube Surface Area:"+sa);
    }
}
class Cuboid  extends Shape{
    Cuboid(double l,double b,double h){
        super(l,b,h);
    }
    void volume(){
        double v = length * breadth * height;
        System.out.println("Volume of Cuboid is: "+v);
    }
    void surfaceArea(){
        double sa = 2*(length*breadth+breadth*height+height*length);
        System.out.println("Cuboid Surface Area:"+sa);
    }
}
class Cylinder  extends Shape{
    Cylinder(double r,double h){
        super(r,r,h);
    }
    void volume(){
        double v =Math.PI* length * breadth * height;
        System.out.println("Cylinder Volume is: "+v);
    }
    void surfaceArea(){
        double sa = 2*Math.PI* length * (length * height);
        System.out.println("Cylinder Surface Area:"+sa);
    }
}
public class Abstractiontest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side of cube: ");
        double side=sc.nextDouble();
        Cube c = new Cube(side);
        c.volume();
        c.surfaceArea();

        System.out.print("\nEnter length, breadth, height of cuboid: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Cuboid cb = new Cuboid(l, b, h);
        cb.volume();
        cb.surfaceArea();

        // Cylinder
        System.out.print("\nEnter radius and height of cylinder: ");
        double r = sc.nextDouble();
        double h2 = sc.nextDouble();
        Cylinder cy = new Cylinder(r, h2);
        cy.volume();
        cy.surfaceArea();
    }
}
