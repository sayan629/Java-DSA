//Q3. Modify ArrayProgram.java to create same (m) no of array of objects of OneDArray as the
//no of rows available in the array (m X n) of TwoDArray. Then add another method in
//TwoDArray class that can distribute all rows of the 2D array of TwoDArray class into each object of OneDArray class.

package TwoDArray;

import java.util.Scanner;

class OneeDArray{
    int [] arr;

    OneeDArray(int n){
        arr=new int[n];
    }
    void show(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class TwooDArray{
    int [][] arr;
    int m,n;
    TwooDArray(int m,int n){
        this.m=m;
        this.n=n;
        arr=new int [m][n];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        System.out.println("2D Array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void Distribute(OneeDArray[]obj){
        for(int i=0;i<m;i++ ){
            for(int j=0;j<n;j++){
                obj[i].arr[j]=arr[i][j];
            }
        }
    }
}
public class ModifiedArrayProgram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows (m):");
        int m = sc.nextInt();
        System.out.print("Enter Number of columns (n):");
        int n=sc.nextInt();

        TwooDArray obj = new TwooDArray(m,n);
        obj.input();
        obj.display();

        OneeDArray[] object= new OneeDArray[m];

        for(int i=0;i<m;i++){;
            object[i]=new OneeDArray(n);
        }
        obj.Distribute(object);
        System.out.println("Rows Stored in OneDArray objects:");

        for(int i=0;i<m;i++){
            System.out.print("Row "+(i+1)+": ");
            object[i].show();
        }

    }
}
