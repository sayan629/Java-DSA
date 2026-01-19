import java.util.Scanner;
public class SeriesC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n= sc.nextInt();
        double sum=1.0;
        int fact=1; // fact starts with 1

        System.out.println("1 ");
        for(int i=2;i<=n;i++){
            fact=fact*i;
            System.out.println("+ 1/" + i + "! ");
            sum=sum+1.0/fact;
        }
        System.out.println("\nSum of Series="+sum);
        sc.close();


    }
}
