import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Fahrenheit,celsius,InputedFahrenheit;
        System.out.print("Enter Temparature (Fahrenheit):");
        Fahrenheit=sc.nextDouble();

        celsius = (5.0 / 9.0) * (Fahrenheit - 32);
        InputedFahrenheit=(9.0/5.0)* celsius+ 32;

     //        celsius = ((int)(celsius * 100)) / 100.0;  // truncate to 2 decimal places

        System.out.printf("Temparature in Celsius =%.2f\n",celsius);
        System.out.printf("Inputed Fahrenheit =%.2f\n", InputedFahrenheit);

        sc.close();

    }
}
