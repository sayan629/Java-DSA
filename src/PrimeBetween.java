import java.util.Scanner;
public class PrimeBetween {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Number:");
        int m =sc.nextInt();

        System.out.println("Enter Last Number:");
        int n= sc.nextInt();

        System.out.println("The Prime Number between" + m + " and " + n +":");

        for(int i=m;i<=n;i++){
            if(i<=1)
                continue;
            int count=0;
            for(int j=1;j<=i;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
                if(count==2){
                    System.out.println(i + " ");

            }
        }
    }
}
