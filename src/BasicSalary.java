/*WAP in JAVA to input basic salary and to compute Gross salary of an employee if salary is less than 12000 then HRA will be 20%, and DA will
be 115% of Basic salary otherwise HRA will be 15% and DA will be 90% of Basic salary.*/

import java.util.Scanner;

public class BasicSalary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double hra, da, gross;
        System.out.println("Enter Basic Salary of the Employee:");
        double basic= sc.nextDouble();
        if(basic<12000){
            hra=0.20*basic;
            da=1.15*basic;
        }else{
            hra=0.15*basic;
            da=0.90*basic;
        }
        gross=(basic+hra+da);
        System.out.println("HRA = "+ hra);
        System.out.println("DA = "+ da);
        System.out.println("Gross Salary = "+ gross);
        sc.close();
    }
}
