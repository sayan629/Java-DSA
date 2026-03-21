//WAP to create a two dimensional array of (m rows x n columns). Initialize it through
//constructor. Input data into it and display using different methods.

package TwoDArray;

import java.util.Scanner;

class Matrix{
    int[][]arr;
    int row,col;

    Matrix(int r, int c){
        row=r;
        col=c;
        arr=new int[r][c];
    }
    void inputmatrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements:");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void displaymatrix(){
        System.out.println("Array elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void displayEnhanced(){
        System.out.println("Using For-Each Loop:");
        for(int [] row:arr){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
public class MatrixArrayDemo {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row=sc.nextInt();
        System.out.print("Enter columns: ");
        int col=sc.nextInt();

        Matrix obj =new Matrix(row,col);
        obj.inputmatrix();
        obj.displaymatrix();
        obj.displayEnhanced();
    }
}
