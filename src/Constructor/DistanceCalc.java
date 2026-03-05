package Constructor;

class MyDistance{
    int km;
    int meter;

    MyDistance(){
        km=0;
        meter=0;
    }
    MyDistance(int km,int meter){
        this.km=km;
        this.meter=meter;
    }
    MyDistance(MyDistance d){
        km=d.km;
        meter=d.meter;
    }
    void showDistance(){
        System.out.println(km+" km "+meter+" meter");
    }

    MyDistance addDistance(MyDistance d){
        MyDistance res=new MyDistance(6, 800);
        res.km=this.km+d.km;
        res.meter=this.meter+d.meter;

        if(res.meter>=1000){
            res.km +=res.meter/1000;
            res.meter=res.meter%1000;
        }
        return res;
    }
    MyDistance subtractDistance(MyDistance d){
        MyDistance res=new MyDistance(6, 800);
        int m1=this.km*1000+this.meter;
        int m2=d.km*1000+d.meter;

        int diff=m1-m2;

        res.km=diff/1000;
        res.meter=diff%1000;
        return  res;
    }
}
public class DistanceCalc {
    static void main(String[] args) {
        MyDistance d1= new MyDistance(7,900);
        MyDistance d2= new MyDistance(6,600);

        MyDistance add=d1.addDistance(d2);
        MyDistance sub=d1.subtractDistance(d2);

        System.out.println("Distance 1: ");
        d1.showDistance();
        System.out.println("Distance 2: ");
        d2.showDistance();
        System.out.println("Addition: ");
        add.showDistance();
        System.out.println("Subtraction: ");
        sub.showDistance();
    }
}
