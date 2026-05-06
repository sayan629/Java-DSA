package Thread;

class A extends Thread{
    public void run(){
        System.out.println("Thread 1 Started...");
        for(int i =0;i<5;i++){
            System.out.println("From Thread 1: i=" +i);
        }
        System.out.println("Exit from Thread 1...");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("Thread 2  Started...");
        for(int j=0;j<5;j++){
            System.out.println("From Thread 2: j=" +j);
        }
        System.out.println("Exit from Thread 2...");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("Thread 3 Started....");
        for(int k=0;k<5;k++){
            System.out.println("From Thread 3: k=" +k);
        }
        System.out.println("Exit from Thread 3...");
    }
}
public class ThreadPriority {
    static void main(String[] args) {
        A thread1=new A();
        B thread2=new B();
        C thread3=new C();
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Start Thread 1");
        thread1.start();
        System.out.println("Start Thread 2");
        thread2.start();
        System.out.println("Start Thread 3");
        thread3.start();
        System.out.println("End From Main Thread");
    }
}
