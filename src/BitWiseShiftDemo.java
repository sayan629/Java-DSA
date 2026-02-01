import java.util.Scanner;
/**
 * Demonstrates left shift, right shift and unsigned right shift operators
 */
public class BitWiseShiftDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of v: ");
            int v = sc.nextInt();
            System.out.print("Enter shifting value n: ");
            int n = sc.nextInt();

            // Left Shift
            int leftShift = v << n;
            // Signed Right Shift
            int rightShift = v >> n;
            // Unsigned Right Shift
            int unsignedRightShift = v >>> n;

            System.out.println("\nOriginal Value: " + v);
            System.out.println("Left Shift (v << n): " + leftShift);
            System.out.println("Right Shift (v >> n): " + rightShift);
            System.out.println("Unsigned Right Shift (v >>> n): " + unsignedRightShift);

            sc.close();
        }
    }

