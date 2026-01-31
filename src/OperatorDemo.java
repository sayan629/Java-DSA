public class OperatorDemo {
    public static void main(String[] args) {
        int a=5;

        //Increment Operator
        System.out.println("Initial Value of a = "+a);
        System.out.println("Post-increment (a++) = " + (a++));
        System.out.println("After post-increment, a = " + a);
        System.out.println("Pre-increment (++a) = " + (++a));
        System.out.println("After pre-increment, a = " + a);

        // Decrement operators
        System.out.println("Post-decrement (a--) = " + (a--));
        System.out.println("After post-decrement, a = " + a);
        System.out.println("Pre-decrement (--a) = " + (--a));
        System.out.println("After pre-decrement, a = " + a);

        // Assignment operators
        a += 5;   // a = a + 5
        System.out.println("After a += 5, a = " + a);

        a -= 3;   // a = a - 3
        System.out.println("After a -= 3, a = " + a);

        a *= 2;   // a = a * 2
        System.out.println("After a *= 2, a = " + a);

        a /= 4;   // a = a / 4
        System.out.println("After a /= 4, a = " + a);

        a %= 3;   // a = a % 3
        System.out.println("After a %= 3, a = " + a);
    }
}
