//Input a number and check whether it is palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();

        int temp=num;
        int rem,rev=0;
        while(num !=0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(rev==0){
            System.out.println("The Entered Number "+temp+" is Palindrome.\n");
        }
        else{
            System.out.println("The Entered Number "+temp+" is Not Palindrome.\n");
        }

    }
}
