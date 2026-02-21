class Add{
    int add(int x, int y){
        return x+y;
    }
    int add(int x,int y, int z){
        return x+y+z;
    }
}
public class MethodOverloading1{
    static void main(String[] args) {
        Add obj = new Add();
        int r1= obj.add(5,6);
        int r2= obj.add(3,4,5);
        System.out.println(r1);
        System.out.println(r2);

    }
}
