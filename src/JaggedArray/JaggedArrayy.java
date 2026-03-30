package JaggedArray;

import java.util.Scanner;

public class JaggedArrayy {

    // a) One Array to hold the marks of five brothers & sisters (jagged array)
    private int[][] marks;
    private String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
    private int[] subjects = {3, 5, 2, 6, 4};

    // b) Constructor to allocate memory for the Array
     JaggedArrayy() {
        marks = new int[5][];
        for (int i = 0; i < 5; i++) {
            marks[i] = new int[subjects[i]];
        }
        System.out.println("Memory allocated: Child1→3 subjects, Child2→5, Child3→2, Child4→6, Child5→4\n");
    }

    // c) Input marks
    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + subjects[i] + " marks for " + childNames[i] + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }
    }

    // d) Show marks row-wise with child name
    public void displayMarks() {
        System.out.println("\n===== MARKS (Row-wise) =====");
        for (int i = 0; i < 5; i++) {
            System.out.print(childNames[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]);
                if (j < marks[i].length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }

    // e) Total marks for each child
    public void showTotalMarks() {
        System.out.println("\n===== TOTAL MARKS =====");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int mark : marks[i]) total += mark;
            System.out.println(childNames[i] + " → Total: " + total);
        }
    }

    // f) Count marks > 80 for each child
    public void countAbove80() {
        System.out.println("\n===== MARKS > 80 =====");
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int mark : marks[i]) {
                if (mark > 80) count++;
            }
            System.out.println(childNames[i] + " → Subjects with marks > 80: " + count);
        }
    }

    // g) Alert for marks < 30
    public void alertLowMarks() {
        System.out.println("\n===== ⚠ ALERT: MARKS < 30 (Needs Better Preparation) =====");
        boolean anyAlert = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 30) {
                    System.out.println("ALERT! " + childNames[i] + " - Subject " + (j + 1)
                            + " has only " + marks[i][j] + " marks. Needs improvement!");
                    anyAlert = true;
                }
            }
        }
        if (!anyAlert) System.out.println("Great! No child has marks below 30.");
    }

    // Main method
    public static void main(String[] args) {
        JaggedArrayy ja = new JaggedArrayy();
        ja.inputMarks();
        ja.displayMarks();
        ja.showTotalMarks();
        ja.countAbove80();
        ja.alertLowMarks();
    }
}
