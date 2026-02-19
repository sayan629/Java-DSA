class Student1 {
    int roll;
    String name;
    static String college="NM";
    static void change(){
        college="KIIT";
    }
    Student1(int r,String n){
        roll=r;
        name=n;
    }
    void display(){
        System.out.println(roll + "" + name+ ""+college);
    }
}
public class TestStaticMethod {
    static void main(String[] args) {
        Student1.change();
        Student1 s1=new Student1(188,"Sayan");
        Student1 s2=new Student1(207,"Shlok");
        Student1 s3=new Student1(333,"Sonu");
        s1.display();
        s2.display();
        s3.display();

    }
}
