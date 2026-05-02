package MultilevelInheritance;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private  String department;
    protected double salary;

    Employee(){
        id=0;
        name="";
        department="";
        salary=0.0;
    }
    Employee(int id,String name,String department,double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        name=sc.nextLine();
        System.out.print("Enter Department:");
        department=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter Salary:");
        salary=sc.nextDouble();
    }
    void display(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Department:"+department);
        System.out.println("Employee Salary:"+salary);
    }
}
class Manager extends Employee{
    private double bonus;
    Manager(){
        super();
        bonus=0.0;
    }
    Manager(int id,String name,String department,double salary,double bonus){
        super(id,name,department,salary);
        this.bonus=bonus;
    }
    void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bonus:");
        bonus=sc.nextDouble();
    }
    void display(){
        super.display();
        System.out.println("Bonus:"+bonus);
        System.out.println("Total Salary: "+(salary+bonus));
    }
    double totalSalary(){
        return salary+bonus;
    }
}
public class MultilevelInheritance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Employees:");
        int n =sc.nextInt();

        Manager [] m = new Manager[n];
        for(int i=0;i<n;i++){
            System.out.println("\n Enter details of Manager: "+(i+1));
            m[i]=new Manager();
            m[i].accept();
        }
        int maxIndex=0;
        for(int i=1;i<n;i++){
            if(m[i].totalSalary()>m[maxIndex].totalSalary()){
                maxIndex=i;
            }
        }
        System.out.println("\nManager with Maximum Total Salary: ");
        m[maxIndex].display();
    }
}
