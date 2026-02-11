//Create a class Student with the following data members Roll No, Name, Marks in 3 subjects.
//Create methods to Input student details, calculate total &amp; percentage and display the report.
//Create at least 2 student objects and display their results.

import java.util.Scanner;

// Student class definition
class Student {
    // Data members (Instance variables)
    int roll;
    String name;
    int m1, m2, m3;
    double total;
    double percentage;


    // Method to take input from user
    void input(Scanner sc) {
        System.out.print("Enter ROll:");
        roll = sc.nextInt();
        System.out.print("Enter Name:");
        name = sc.next();
        System.out.print("Enter Marks for Sub 1:");
        m1 = sc.nextInt();
        System.out.print("Enter Marks for Sub 2:");
        m2 = sc.nextInt();
        System.out.print("Enter Marks for Sub 3:");
        m3 = sc.nextInt();
    }

    // Method to calculate total and percentage
    void calculate() {
        total = m1 + m2 + m3;
        percentage = (total/300.0) * 100;
    }

    // Method to display student report
    void showdetails() {
        System.out.println("-----------Report Card---------");
        System.out.println("Roll is :" + roll);
        System.out.println("Name is :" + name);
        System.out.println("Total marks are: "+ total);
        System.out.println("Pecentage is: "+percentage);
        System.out.println("----------------------------------");
    }
}

// Main class
public class StudentDetails {
    // Main method - program execution starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating first student object
        Student s1= new Student();
        s1.input(sc);
        s1.calculate();
        // Creating second student object
        System.out.println("\nEnter details for Student 2");
        Student s2 = new Student();
        s2.input(sc);
        s2.calculate();

        System.out.println("\\n===== STUDENT RESULTS =====");
        s1.showdetails();
        s2.showdetails();

        sc.close();
    }
}




