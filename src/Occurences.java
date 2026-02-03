import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Number to find: ");
        int s= sc.nextInt();
        int count=0;
        while (n!=0){
            int rem=n%10;
            if(rem==s){
                count++;
            }
            n=n/10;
        }
        System.out.println("Number of Occurences "+count);
    }
}
