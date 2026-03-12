package Searching;

import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        int [] arr={2,3,4,5,7};
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Elements to be searched: ");
        int item=sc.nextInt();
        int loc=-1;
        while(i< arr.length && arr[i]!=item) {
            i = i + 1;
        }
        if (i >= arr.length) {
            System.out.println("Element are not Found.....");
        } else {
                loc=i;
                System.out.println("Elements found at position: "+loc);
            }
    }
}
