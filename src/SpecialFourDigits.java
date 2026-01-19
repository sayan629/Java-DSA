public class SpecialFourDigits {
    public static void main(String[] args) {

        System.out.println("Enter 4 digits number are:");
        int sum = 0, n;
        for (n = 1000; n <= 9999; n++) {
            int first = n / 100;
            int last = n % 100;
            sum = first + last;

            if (sum * sum == n) {
                System.out.println(n);
            }
        }
    }
}
