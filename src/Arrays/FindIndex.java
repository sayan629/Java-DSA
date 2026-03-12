// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

package Arrays;

import java.util.Scanner;

public class FindIndex {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[5];
        System.out.print("Enter the elements in the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Elemnt to found:");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("x found at index:" +i);
            }
            else{
                System.out.println("Given value is not present in the array");
                break;
            }
        }

    }
}

