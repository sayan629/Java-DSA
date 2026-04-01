//Create two classes such as Teacher (basic, da, hra, epf, sub_taught) and Student (fees_per_sem, course, duration) which are inherited from class
//Person(name, Id, year_of_join). Design appropriate methods to input the data as given above whenever required.
//Prepare an annual report for a Teacher showing the details such as Name, Id,Subject Taught, Joining year, Basic salary per month, Total net salary received
//per year, Total Epf deposited per year. If [Basic=15500/-, da=110%, hra=15%,and epf=12%]
//Inform the student by showing details such as Name, Id, Course Offered,
//Joining year and total fees to be paid if the course duration is 4 years and fees per semester is 18000/-.


package SingleInheritance;

class Person{
    String name;
    int id;
    int year_of_join;
    Person(String name,int id,int year_of_join){
        this.name=name;
        this.id=id;
        this.year_of_join=year_of_join;
    }
}
class Teacher extends Person{
    double basic;
    double da;
    double hra;
    double epf;
    String subTaught;

    Teacher(String name, int id, int year_of_join, double basic, double da, double hra, double epf, String subTaught) {
        super(name, id, year_of_join);
        this.basic=basic;
        this.da=da;
        this.hra=hra;
        this.epf=epf;
        this.subTaught=subTaught;
    }
    void annualReport(){
        double grossSalary = basic + (basic * da / 100) + (basic * hra / 100);
        double netSalaryPerMonth = grossSalary - (basic * epf / 100);
        double netSalaryPerYear = netSalaryPerMonth * 12;
        double epfPerYear = (basic * epf / 100) * 12;
        System.out.println("----- Teacher Annual Report -----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject Taught: " + subTaught);
        System.out.println("Joining Year: " + year_of_join);
        System.out.println("Basic Salary per Month: " + basic);
        System.out.println("Total Net Salary per Year: " + netSalaryPerYear);
        System.out.println("Total EPF Deposited per Year: " + epfPerYear);
        System.out.println("--------------------------------");
    }
}
class Studentt extends Person{
    double feesPerSem;
    String Course;
    int duration;
    Studentt(String name, int id, int year_of_join, double feesPerSem, String Course, int duration) {
        super(name, id, year_of_join);
        this.feesPerSem=feesPerSem;
        this.Course=Course;
        this.duration=duration;
    }
    void studentReport(){
        int totalSemesters= duration*2;
        double totalFees= feesPerSem*totalSemesters;
        System.out.println("----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course : " + Course);
        System.out.println("Joining Year: " + year_of_join);
        System.out.println("Total Fees to be Paid: " + totalFees);
        System.out.println("--------------------------");

    }
}

public class Inheritance3 {
    static void main(String[] args) {
        Teacher t = new Teacher("Utpal Kumar De",101,2003, 15500, 110, 15, 12, "Java");
        t.annualReport();

        Studentt s = new Studentt("Sayan Pal", 188, 2025, 120000, "MCA ", 2);
        s.studentReport();
    }
}
