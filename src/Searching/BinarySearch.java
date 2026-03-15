// Note: Binary Search Always done in Sorted Order
//Linear Search → Any array
//Binary Search → Sorted array only

package Searching;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int key = sc.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int mid;
        while(l <= h){
            mid = (l + h) / 2;
            if(key == arr[mid]){
                System.out.println("Element "+key+" found at index: " + mid);
                break;
            }
            else if(key < arr[mid]){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        if(l > h){
            System.out.println("Element not found");
        }
    }
}