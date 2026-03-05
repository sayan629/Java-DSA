package Constructor;


class Rectangle{
    int length;
    int width;

    Rectangle(){
        length=0;
        width=0;
    }
    Rectangle(int l,int w){
        length=l;
        width=w;
    }
    Rectangle(Rectangle r){
        length=r.length;
        width=r.width;
    }
    void showRectangle(){
        System.out.println("Length: "+length+" Width: "+width);
    }
    int area(){
        return length*width;
    }
    int perimeter(){
        return 2*(length+width);
    }
}
public class CalculateRectangle {
    static void main(String[] args) {
        Rectangle r1=new Rectangle(10,6);

        System.out.println("Rectangle 1: ");
        r1.showRectangle();
        System.out.println("Area is : "+r1.area());
        System.out.println("Perimeter is : "+r1.perimeter());
    }
}
