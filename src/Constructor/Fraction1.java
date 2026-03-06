package Constructor;

class Fractionn {
    int num;
    int denum;

    // Default constructor
    Fractionn() {
        num = 0;
        denum = 1;
    }

    // One argument constructor
    Fractionn(int n) {
        num = n;
        denum = 1;
    }

    // Two argument constructor
    Fractionn(int n, int d) {
        num = n;
        denum = d;
    }

    // Copy constructor
    Fractionn(Fractionn f) {
        num = f.num;
        denum = f.denum;
    }

    void show() {
        System.out.println(num + "/" + denum);
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    void reduce() {
        int g = gcd(Math.abs(num), Math.abs(denum));
        num = num / g;
        denum = denum / g;

        if (denum < 0) {
            num = -num;
            denum = -denum;
        }
    }

    void mixed() {
        if (Math.abs(num) > denum) {
            int whole = num / denum;
            int remainder = Math.abs(num % denum);

            if (remainder != 0)
                System.out.println("Mixed Fraction: " + whole + " " + remainder + "/" + denum);
            else
                System.out.println("Whole Number: " + whole);
        } else {
            show();
        }
    }

    Fractionn add(Fractionn f) {
        Fractionn temp = new Fractionn();
        temp.num = (num * f.denum) + (f.num * denum);
        temp.denum = denum * f.denum;
        temp.reduce();
        return temp;
    }

    Fractionn subtract(Fractionn f) {
        Fractionn temp = new Fractionn();
        temp.num = (num * f.denum) - (f.num * denum);
        temp.denum = denum * f.denum;
        temp.reduce();
        return temp;
    }

    Fractionn multiply(Fractionn f) {
        Fractionn temp = new Fractionn();
        temp.num = num * f.num;
        temp.denum = denum * f.denum;
        temp.reduce();
        return temp;
    }

    Fractionn div(Fractionn f) {
        Fractionn temp = new Fractionn();
        temp.num = num * f.denum;
        temp.denum = denum * f.num;
        temp.reduce();
        return temp;
    }

    void compare(Fractionn f) {
        int left = num * f.denum;
        int right = denum * f.num;

        if (left > right)
            System.out.println("First fraction is greater");
        else if (right > left)
            System.out.println("Second fraction is greater");
        else
            System.out.println("Both fractions are equal");
    }
}

public class Fraction1 {

    public static void main(String[] args) {

        Fractionn f1 = new Fractionn();
        Fractionn f2 = new Fractionn(5);
        Fractionn f3 = new Fractionn(8, 4);
        Fractionn f4 = new Fractionn(f3);

        System.out.print("f1: ");
        f1.show();

        System.out.print("f2: ");
        f2.show();

        System.out.print("f3: ");
        f3.show();

        System.out.print("f4 (copy): ");
        f4.show();

        Fractionn add = f2.add(f3);
        System.out.print("Addition: ");
        add.show();
        add.mixed();

        Fractionn sub = f2.subtract(f3);
        System.out.print("Subtraction: ");
        sub.show();

        Fractionn mul = f2.multiply(f3);
        System.out.print("Multiplication: ");
        mul.show();

        Fractionn div = f2.div(f3);
        System.out.print("Division: ");
        div.show();

        f2.compare(f3);
    }
}