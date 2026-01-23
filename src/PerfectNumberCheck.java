//Input a number and check whether it is a perfect number or not.
import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n && n!=0){
            System.out.println(""+n+" is Perfect Number");
        }
        else{
            System.out.println(""+n+" is not Perfect Number");
        }
        sc.close();
    }
}
