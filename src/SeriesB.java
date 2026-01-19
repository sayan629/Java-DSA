
import java.util.Scanner;

public class SeriesB {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= sc.nextInt();
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        double sum=0.0;
        for(int i=0;i<=n;i++){
            sum+=1.0/Math.pow(x,i);
        }
        System.out.println("The Sum of the Series =" +sum);
    }
}
