//Create a class Employee having data member Emp ID, Name, Basic Salary , TA,DA,HRA,PF.
//Create methods input() to input Emp ID, Name, Basic Salary and calculate() to calculate
//DA =65% of Basic, HRA = 15% of Basic, TA= 24% of Basic, PF =21% of Basic .
// Gross Salary = Basic +TA+DA + HRA. Net_Salary=Gross-PF. Display full salary slip.
import java.util.Scanner;
class Employee{
    int EmpID;
    String Name;
    double BasicSalary;
    double TA;
    double DA;
    double HRA;
    double PF;
    double Gross_Salary;
    double Net_Salary;

    public void input(Scanner sc){
        System.out.print("Enter Employee Id: ");
        EmpID=sc.nextInt();
        System.out.print("Enter Employee Name: ");
        Name=sc.next();
        System.out.print("Enter Basic Salary: ");
        BasicSalary=sc.nextDouble();
    }
    void Calculate(){
        DA=0.65*BasicSalary;
        HRA=0.15*BasicSalary;
        TA=0.24*BasicSalary;
        PF=0.21*BasicSalary;
        Gross_Salary=BasicSalary+TA+HRA+DA;
        Net_Salary=Gross_Salary-PF;
    }
    void Display(){
        System.out.println("===========Salary Slip============");
        System.out.println("Employee Id is: "+EmpID);
        System.out.println("Name is: "+Name);
        System.out.println("Basic Salary is: "+BasicSalary);
        System.out.println("TA is: "+TA);
        System.out.println("DA is: "+DA);
        System.out.println("HRA is: "+HRA);
        System.out.println("PF is: "+PF);
        System.out.println("Gross Salary is: "+Gross_Salary );
        System.out.println("Net Salary is: "+Net_Salary);
        System.out.println("===================================");
    }
}

public class EmployeeDetails {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1=new Employee();
        e1.input(sc);
        e1.Calculate();
        e1.Display();
        sc.close();
    }
}
