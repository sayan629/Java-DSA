import java.util.Scanner;

public class StringReturnFunction {
    static void main(String[] args) {
        String message=greeting();
        System.out.println(message);
    }


    static String greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One String");
        String name = sc.next();
        return name;
    }
}
