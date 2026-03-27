package SingleInheritance;


class Student {
    int roll, marks;
    String name;

    void input() {
        System.out.println("Roll , Name , Marks :");
    }
}
 class Rusa extends Student{
    void display(){
        int roll = 1;
        String name="Rusa";
        int marks=88;
        System.out.println(roll+" "+name+" "+marks);
    }
}
public class Inheritance1 {

    public static void main(String[] args) {
        Rusa r = new Rusa();
        r.input();
        r.display();
    }
}
