package Arrays;

import java.util.Scanner;

public class Maxmin {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] number=new int[5];
        int i;
        System.out.println("Enter the Number: ");
        for(i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        int max=number[0];
        int min=number[0];
        for(i=0;i<number.length;i++){
            if(number[i]>max) {
                max = number[i];
            }
                if(number[i]<min) {
                    min = number[i];
                }

        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

    }

}
