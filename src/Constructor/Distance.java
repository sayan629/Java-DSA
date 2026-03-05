package Constructor;
class Point{
    int x, y;


    Point(){
        x=0;
        y=0;
    }
    Point(int a){
        x=a;
        y=a;
    }
    Point(Point p){
        x=p.x;
        y=p.y;
    }
    int distance(Point p){
        int dx= x-p.x;
        int dy= y-p.y;
        double result= Math.sqrt(dx*dx + dy*dy);
        return (int) result;
    }
    void displayPoint(){
        System.out.println(x+" "+y);
    }
}
public class Distance {
    static void main(String[] args) {
        Point p1 = new Point();
        Point p2=new Point(6);
        Point p3=new Point(5);
        Point p4=new Point(p2);

        System.out.println("Point 1: ");
        p2.displayPoint();
        System.out.println("Point 2:");
        p3.displayPoint();

        int d = p2.distance(p3);
        System.out.println("Distance ="+d);

    }
}

