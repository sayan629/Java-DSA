// Generate ArmStrong number between 100 to 1000


public class ArmstrongNumber {
    public static void main(String[] args) {
        int num,sum=0, digit,temp;

        System.out.println("ArmStrong Number between 100 to 1000");

        for(num=100;num<1000;num++) {
            sum = 0;
            temp = num;


            while (temp > 0) {
                digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.println(num + " ");
            }
        }
    }
}
