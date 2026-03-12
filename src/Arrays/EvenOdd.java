package Arrays;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] num=new int [5];
        int i=0;
        int oddcount=0,evencount=0;
        System.out.println("Enter 5 Numbers: ");
        for(i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        for(i=0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.println("Even numbers are: "+num[i]);
                evencount++;
            }
            else{
                System.out.println("Odd Numbers are: "+num[i]);
                oddcount++;
            }
        }
        System.out.println("Total Even Numbers : "+evencount);
        System.out.println("Total Odd Numbers : "+oddcount);
        sc.close();
    }
}
