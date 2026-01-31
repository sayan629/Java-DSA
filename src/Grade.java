import java.util.Scanner;

public class Grade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name= sc.nextLine();
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks for Subject 5: ");
        int s5 = sc.nextInt();

        int total=s1+s2+s3+s4+s5;
        float percentage =(float)total/ 5;
        String grade;
        switch((int) percentage / 10) {
            case 10:
            case 9: grade = "O"; break;
            case 8: grade = "E"; break;
            case 7: grade = "A"; break;
            case 6: grade = "B"; break;
            case 5: grade = "C"; break;
            case 4: grade = "D"; break;
            default: grade = "Fail";
        }
        System.out.println("\n------------------- MARK SHEET -------------------");
        System.out.println("Roll No   : " + roll);
        System.out.println("Name      : " + name);
        System.out.println("-------------------------------------------------");
        System.out.println("Total Marks   : " + total);
        System.out.println("Percentage    : " + percentage + "%");
        System.out.println("Grade         : " + grade);
        System.out.println("-------------------------------------------------");

        sc.close();
    }
}

