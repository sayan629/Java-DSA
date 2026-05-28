package Thread;

public class ThreadTest {
    static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        Thread k = Thread.currentThread();
        System.out.println("Current Thread:"+k+t);

        t.setName("My Thread");
        System.out.println("my Thread:"+t);

        for(int i=0;i<5;i++){
            System.out.println(i);
            k.sleep(2000);
        }
    }
}
