
class Complex{
    int real;
    int imag;

    Complex(){
        real=0;
        imag=0;
    }
    Complex(int r , int i){
        real=r;
        imag=i;
    }
    Complex(Complex c){
        real=c.real;
        imag=c.imag;
    }
    void showComplex(){

        System.out.println(real+"+"+imag+"i");
    }
    Complex addComplex(Complex c){
        Complex temp=new Complex();
        temp.real=real+c.real;
        temp.imag=imag+c.imag;
        return temp;
    }
    Complex subractComplex(Complex c){
        Complex temp1= new Complex();
        temp1.real=real-c.real;
        temp1.imag=imag-c.imag;
        return temp1;
    }
    Complex Multiply(Complex c){
        Complex temp2=new Complex();
        temp2.real= (real*c.real) - (imag*c.imag);
        temp2.imag= (real*c.imag) + (imag*c.real);
        return temp2;
    }
}
public class imaginaryandReal {
    static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex(6,4);
        Complex c4=new Complex(5,3);

        System.out.println("Complex No1:");
        c2.showComplex();
        System.out.println("Complex No2:");
        c4.showComplex();

        Complex add= c2.addComplex(c4);
        System.out.println("Addition: ");
        add.showComplex();

        Complex sub= c2.subractComplex(c4);
        System.out.println("Subtraction: ");
        sub.showComplex();

        Complex mul= c2.Multiply(c4);
        System.out.println("Multiplication:");
        mul.showComplex();
    }
}
