package Arrays;

import java.util.Scanner;

class MyArray{
    int arr[];
    int size;

    //Constructor
    MyArray(int s){
        size=s;
        arr=new int[size];

    //Initialize with zeros
        for(int i=0;i<size;i++){
            arr[i]=0;
        }
    }
    // Input Array Elements

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }

    // Display elements

    void Display(){
        System.out.println("Array ELements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Sum and Average
    void sumAvg(){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        double avg=(double)sum/size;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }

    //Swap Max and Min
    void swapmaxmin(){
        int max=arr[0];
        int min=arr[0];
        int maxIndex=0;
        int minIndex=0;

        for(int i=0;i<size;i++){
            if(arr[i]>max)
            {
                max=arr[i];
                maxIndex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[minIndex];
        arr[minIndex]=temp;
        System.out.println("After Swapping: ");
        Display();
    }

    //Find the occurrence of all unique elements.
    void findUniqueOccurrence(){
        System.out.println("Occurences of Unique elements:");
        boolean [] visited=new boolean[size];

        for(int i=0;i<size;i++){
            if(visited[i])
                continue;
            int count=1;

            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+ " occurs " + count + " time" );
        }
    }
    //convert number to single digit
    int SingleDigit(int n)
    {
        while(n>9) {
            int sum = 0;

        while(n>0){
            sum= sum + n % 10;
            n=n/10;
        }
        n=sum;
    }
        return n;
    }
    // Three digit number and find greatest
    void greatestNumber(){
        int max=0;
        for(int i=0;i<size;i=i+3){
            int a=0,b=0,c=0;
            if(i<size)
                a=SingleDigit(arr[i]);
            if(i+1<size)
                b=SingleDigit(arr[i+1]);
            if(i+2<size)
                c=SingleDigit(arr[i+2]);

            int n=a*100+b*10+c;
            System.out.println("New Number: "+n);

            if(n>max)
                max=n;
        }
        System.out.println("Greatest Number: "+max);
    }
}

public class ClassusingArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();

        MyArray obj = new MyArray(n);
        obj.input();
        obj.Display();
        obj.sumAvg();
        obj.swapmaxmin();
        obj.findUniqueOccurrence();
        obj.greatestNumber();
    }
}

