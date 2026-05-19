package Thread;

class PrintThread extends Thread{
    private int sleepTime;
    public PrintThread(String name){
        super(name);
        sleepTime=(int)(Math.random()*5000);
        System.out.println("Name:"+getName()+"; sleep :"+sleepTime);
    }
    public void run(){
        try{
            System.out.println(getName()+ "going to sleep");
            Thread.sleep(sleepTime);
        }
        catch(InterruptedException e){
            System.out.println(e.toString());
        }
        System.out.println(getName()+ "going to sleep");
    }
}
public class ThreadTester {
    static void main(String[] args) {
        PrintThread thread1,thread2,thread3,thread4;
        System.out.println("\nStarting Thread");
        thread1=new PrintThread("thread1");
        thread2=new PrintThread("thread2");
        thread3=new PrintThread("thread3");
        thread4=new PrintThread("thread4");
        System.out.println("Thread Started\n.");
    }
}
