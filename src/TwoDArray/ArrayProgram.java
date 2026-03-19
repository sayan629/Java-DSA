//Q2. WAP in Java to create two classes such as TwoDArray and OneDArray.
//Members of TwoDArray class are:
//a) One 2D array.
//b) Constructor to allocate memory of size (2 X n) for the array.
//c) Input data into the Array.
//d) Display the array elements in row wise.
//e) Split this array into two different arrays and store them in the array available in two different objects of class OneDArray.
//f) Add the arrays(m X n matrices) of two objects of TwoDArray class.
//g) Multiply the arrays(m X n matrices) of two objects of TwoDArray class.
// Members of OneDArray class are:
//a) One 1D array.
//b) Constructor to allocate memory of size (n) as the column size of TwoDArray class.
//c) Show the array.

package TwoDArray;

import java.util.Scanner;

class OneDArray{
    int[] arr;

    OneDArray(int n){
        arr=new int[n];
    }
    void show(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class TwoDArray{
    int[][] arr;
    int n;

    TwoDArray(int n){
        this.n=n;
        arr=new int [2][n];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements:");
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        System.out.print("2D Array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Split array into two OneDArray objects
    void split(OneDArray a,OneDArray b){
        for(int j=0;j<n;j++){
            a.arr[j]=arr[0][j];
            b.arr[j]=arr[1][j];
        }
    }
    void addition(TwoDArray t1, TwoDArray t2){
        System.out.println("Addition: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                int add=t1.arr[i][j]+t2.arr[i][j];
                System.out.print(add+ " ");
            }
            System.out.println();
        }
    }
    void multiply(TwoDArray t1, TwoDArray t2){
        System.out.println("Multiplication: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                int Mul=t1.arr[i][j]*t2.arr[i][j];
                System.out.print(Mul+ " ");
            }
            System.out.println();
        }
    }
}

public class ArrayProgram {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter column size(n):");
        int n=sc.nextInt();

        TwoDArray obj1=new TwoDArray(n);
        TwoDArray obj2=new TwoDArray(n);

        System.out.println("Enter First Array:");
        obj1.input();

        System.out.println("Enter Second Array:");
        obj2.input();

        obj1.display();
        obj2.display();

        // Splitting
        OneDArray obj3=new OneDArray(n);
        OneDArray obj4=new OneDArray(n);

        obj1.split(obj3,obj4);

        System.out.println("First Row: ");
        obj3.show();
        System.out.println("Second Row: ");
        obj4.show();

        //Addition
        obj1.addition(obj1,obj2);

        //Multiplication
        obj1.multiply(obj1,obj2);
    }
}
