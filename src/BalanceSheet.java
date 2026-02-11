//Create a class BankAccount with data members Account Number, Account Holder Name,
//Balance_amt. Create methods Deposit() ,Withdraw() , Display_balance(). Ensure balance never
//goes negative. Show proper message for insufficient balance. Perform a real-life application
//using class &amp; object.

import java.util.Scanner;
class BankAccount{
    long Account_Number;
    String Account_Holder_Name;
    double balance_amount;

    void CreateAccount(Scanner sc){
        System.out.print("Enter Account Number: ");
        Account_Number=sc.nextLong();

        System.out.print("Enter Account Holder Name: ");
        Account_Holder_Name=sc.next();

        System.out.print("Enter Current Balance: ");
        balance_amount= sc.nextDouble();
    }
    void deposit(Scanner sc){
        System.out.print("Enter Amount to be deposit: ");
        double amount=sc.nextDouble();

        balance_amount+=amount;
        System.out.println("Amount Deposited...");
    }
    void withdraw(Scanner sc){
        System.out.print("Enter Amount to be withdraw:");
        double amount= sc.nextDouble();

        if(amount>balance_amount){
            System.out.println("Insufficient Balance..");
        }
        else{
            balance_amount-=amount;
            System.out.println("Withdraw Successfull.");
        }
    }
    void DisplayBalance(){
        System.out.println("\n---------Account Details--------");
        System.out.println("Account Number: "+ Account_Number);
        System.out.println("Account Holder Name: "+Account_Holder_Name);
        System.out.println("Current Balance: "+balance_amount);
        System.out.println("-------------------------------------");
    }

}
public class BalanceSheet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount s1= new BankAccount();
        s1.CreateAccount(sc);
        s1.deposit(sc);
        s1.withdraw(sc);
        s1.DisplayBalance();
        sc.close();


    }
}
