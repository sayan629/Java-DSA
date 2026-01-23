import java.util.Scanner;

public class DollartoRupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dollars,rupees;
        double rate= 91.68;  // 1 Dollar=91.68 Rupees

        System.out.print("Enter Amount in Dollar:");
        dollars = sc.nextDouble();

        rupees = dollars * rate;

        System.out.println("Amount in Rupees = ₹" + rupees);

        sc.close();
    }
}
