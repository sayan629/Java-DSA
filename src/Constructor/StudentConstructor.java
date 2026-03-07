package Constructor;
class Student3{
    int roll;
    String name;
    String course_name;
    double fees;

    Student3(){   //No-argument Constructor
        roll=0;
        name="not assigned";
        course_name="God Knows";
        fees=0.0;
    }
    Student3(int r, String n,String c, double f){ // Parameterised Constructors
        roll=r;
        name=n;
        course_name=c;
        fees=f;
    }
    Student3(Student3 S){  //Copy Constructors
        roll=S.roll;
        name=S.name;
        course_name=S.course_name;
        fees=S.fees;
    }
    void display(){
        System.out.println(roll+" "+name+ " "+course_name+" "+fees);
    }
}
public class StudentConstructor {
    static void main(String[] args) {
        Student3 obj1= new Student3();
        System.out.println("Default Constructors: ");
        obj1.display();
        Student3 obj2 = new Student3(2570188,"Sayan","MCA",8_00000);
        System.out.println("Using Parameterized Constructors: ");
        obj2.display();
        Student3 obj3 = new Student3(obj2);
        System.out.println("Using Copy Constructors: ");
        obj3.display();
    }
}

