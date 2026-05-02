package MultilevelInheritance;

import java.util.Scanner;

class Number{
    protected int arr[];
    protected int num;

    Number(int Size) {
        num = Size;
        arr = new int[Size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
    }
        void display(){
            System.out.println("All Numbers:");
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
}
class oddnum extends Number{
    protected int oddArr[];
    protected int oddCount;

    oddnum(int Size) {
        super(Size);
        oddCount=0;
        for(int i=0;i<num;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        oddArr = new int[oddCount];
    }
    void copyOdd(){
        int j=0;
        for(int i =0 ;i<num;i++){
            if(arr[i]%2!=0){
                oddArr[j++]=arr[i];
            }
        }
    }
    void displayOdd(){
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.println(oddArr[i]+" ");
        }
        System.out.println();
    }
}
class PrimeNum extends oddnum{
    private int primeArr[];
    private int primeCount;
    PrimeNum(int Size) {
        super(Size);
        primeCount = 0;
    }
    boolean isPrime(int num) {
        if(num<2) return false;

        for(int i=2; i*i<=num;i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    void copyPrime(){
      primeCount=0;
      for(int i=0;i<oddCount;i++){
          if(isPrime(oddArr[i])){
              primeCount++;
      }
        }
        primeArr = new int[primeCount];

        int j=0;
        for(int i=0;i<oddCount;i++) {
            if (isPrime(oddArr[i])) {
                primeArr[j++] = oddArr[i];
            }
        }
    }
    void displayPrime(){
        if(primeCount==0){
            System.out.println("No Prime Numbers");
            return;
        }
        System.out.println("Prime Numbers: ");
        for (int i = 0; i < primeCount; i++) {
            System.out.println(primeArr[i]+" ");
        }
        System.out.println();
    }
}

public class Multilevelnheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of Array: ");
        int n = sc.nextInt();
        PrimeNum obj = new PrimeNum(n);

        obj.display();
        obj.copyOdd();
        obj.displayOdd();
        obj.copyPrime();
        obj.displayPrime();
    }
}
