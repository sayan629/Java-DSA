package TwoDArray;

import java.util.Scanner;

public class FindIndex {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();
        System.out.print("Enter columns:");
        int columns=sc.nextInt();

        int [][] arr= new int[rows][columns];

        System.out.println("Enter the elements of the array:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the index of the element you want to find:");
        int index=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==index){
                    System.out.println("index found at locations (" + i + ", " + j + ")");
                }
            }

        }
    }
}
