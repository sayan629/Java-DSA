package MultilevelInheritance;

class A1{
    void sayHello(){
        System.out.println("Hello From A1.....");
    }
}
class B1 extends A1{
    void sayHello(){
        System.out.println("Hello From B1....");
    }
}
class C1 extends A1{
    @Override
    void sayHello(){
        System.out.println("Hello From C1...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.sayHello();
    }

}
