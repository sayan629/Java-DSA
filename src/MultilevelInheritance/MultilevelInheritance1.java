package MultilevelInheritance;

class A{
    int a,b,c;
    void add(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("The Sum of Two Number's: "+c);
    }
}
class B extends A{
    void subtract(){
        int a=30,b=20;
        int c=a-b;
        System.out.println("The Difference of Two Number's: "+c);
    }
}
class C extends B{
    void multiply(){
        int a=10,b=20;
        int c=a*b;
        System.out.println("The Multiplication of Two Number's: "+c);
    }
}
public class MultilevelInheritance1 {
    static void main(String[] args) {
        C r= new C();
        r.add();
        r.subtract();
        r.multiply();
    }
}
