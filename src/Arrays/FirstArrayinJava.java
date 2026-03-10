package Arrays;

import java.util.Scanner;

public class FirstArrayinJava {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        System.out.println("Enter 5 integers:");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("Array Elements are: "+arr[i]);
        }
        sc.close();
    }
}
