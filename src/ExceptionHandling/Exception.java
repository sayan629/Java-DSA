package ExceptionHandling;


public class Exception {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            divide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This will always executes..");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please dont divide by Zero");
        }
        return a/b;
    }
}

