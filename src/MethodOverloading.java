public class MethodOverloading {
    static void main(String[] args) {
        int ans=sum(5,6,8);
        System.out.println("Sum is : "+ans);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}