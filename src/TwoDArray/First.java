package TwoDArray;

import java.util.Scanner;

public class First {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter columns: ");
        int cols=sc.nextInt();

        int [][] arr=new int[rows][cols];

        System.out.println("Enter the elements of the array");
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("The Two Dimensional Array is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
