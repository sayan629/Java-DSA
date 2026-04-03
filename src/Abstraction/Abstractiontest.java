package Abstraction;

abstract class Fruit{
        String color;
        public String toString(){
            return getClass().getName()+": "+color;
        }
}
class Apple extends Fruit{
    Apple(){
        color="Red";
    }
}
class Banana extends Fruit{
    Banana(){
        color="Yellow";
    }
}
class Orange extends Fruit{
    Orange(){
        color="Orange";
    }
}
class strawberry extends Fruit{
    strawberry(){
        color="Red";
    }
}
public class Abstractiontest {
    static void main(String[] args) {
        Fruit obj = new Apple();
        System.out.println(obj);
        obj= new Banana();
        System.out.println(obj);
        obj=new Orange();
        System.out.println(obj);
    }
}
