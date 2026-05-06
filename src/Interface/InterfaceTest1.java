package Interface;

import java.util.Scanner;

interface IntOperations{
    void checkSign();
    void checkEvenOdd();
    void checkPrime();
    void checkPalindrome();
    void checkfactorial();
    void checksumofdigits();
}
class MyNumber implements IntOperations{
    private int num;
    MyNumber(){
        num=0;
    }
    MyNumber(int num){
        this.num=num;
    }

    public void checkSign() {
        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }
        public void checkEvenOdd(){
            if(num%2==0)
                System.out.println("Even Number");
            else
                System.out.println("Odd Number");

        }
        public void checkPrime(){
        if(num<2){
            System.out.println("Not Prime Number");
            return;
        }
        for(int i =2;i*i<=num ; i++){
            if(num%i==0){
                System.out.println("Prime Number");
                return;
            }
        }
        }
        public void checkPalindrome(){
        int rem,rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(num==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
        }
        public void checkfactorial(){
        if(num<0){
            System.out.println("Not factorial Number");
            return;
        }
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
            System.out.println("Factorial Number: "+fact);
        }
        public void checksumofdigits(){
        int temp = Math.abs(num),sum=0;
        while(temp!=0){
            sum=sum+temp%10;
            temp=temp/10;
        }
            System.out.println("Sum of Digits: "+sum);
        }
}


public class InterfaceTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number");
        int n=sc.nextInt();
        MyNumber ob=new MyNumber(n);

        int choice;
        do{
            System.out.println("\n-----MENU------");
            System.out.println("1. Check Sign");
            System.out.println("2. Check Even Odd");
            System.out.println("3. Check Prime");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Check factorial");
            System.out.println("6. Checksumofdigits");
            System.out.println("7. Exit");
            System.out.println("Enter Choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:ob.checkSign();break;
                case 2:ob.checkEvenOdd();break;
                case 3:ob.checkPrime();break;
                case 4:ob.checkPalindrome();break;
                case 5:ob.checkfactorial();break;
                case 6:ob.checksumofdigits();break;
                case 7:
                    System.out.println("Exiting..");
                    break;
                    default:System.out.println("Invalid Choice");
            }
        }
        while(choice!=7);
    }
}
