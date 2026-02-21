//This is used to call Same class Constructor.
// It is reference variable that refers to the current object of the class.

import java.util.Scanner;

class Student2{
    int roll;
    String name;
    double marks;

    Student2(){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    void input(Scanner sc){
        System.out.print("Enter Roll :");
        roll=sc.nextInt();

        System.out.print("Enter Name:");
        name=sc.next();

        System.out.print("Enter Marks:");
        marks=sc.nextDouble();
    }
    void display(){
        System.out.println(roll+ " "+name+ " "+marks);
    }

}
public class ThisKeyword {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student2 obj= new Student2();
        obj.input(sc);
        obj.display();
        sc.close();
    }
}
