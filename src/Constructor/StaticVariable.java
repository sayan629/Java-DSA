package Constructor;

class Student4{
    int roll;
    static String college="KIIT";

    Student4(int r){
        roll=r;
    }
    void display(){
        System.out.println(roll+" "+college);
    }
}
public class StaticVariable {
    static void main(String[] args) {
        Student4 sayan= new Student4(5);
        Student4 sayan1=new Student4(5);
        sayan.display();
        sayan1.display();
    }

}

