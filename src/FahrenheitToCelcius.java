import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Fahrenheit,celsius;
        System.out.print("Enter Temparature (Fahrenheit):");
        Fahrenheit=sc.nextDouble();

        celsius = (5.0 / 9.0) * (Fahrenheit - 32);


        celsius = ((int)(celsius * 100)) / 100.0;  // truncate to 2 decimal places

        System.out.print("Temparature in Celsius =  "+celsius);
        sc.close();

    }
}
