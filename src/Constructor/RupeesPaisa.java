package Constructor;
class Money{
    int rupees;
    int paisa;

    Money(int r,int p){
        rupees = r;
        paisa = p;
    }
    Money(Money m){
        rupees = m.rupees;
        paisa = m.paisa;
    }
    void showMoney(){
        System.out.println(rupees + " Rupees " + paisa + " Paise ");
    }
    Money addMoney(Money m){
        Money result=new Money(m);
        result.rupees=this.rupees+m.rupees;
        result.paisa=this.paisa+m.paisa;

        if(result.paisa>=100){
            result.rupees+=result.paisa/100;
            result.paisa=result.paisa%100;
        }
        return result;
    }
    Money subMoney(Money m){
        Money result=new Money(m);
        int p1=this.rupees*100+this.paisa;
        int p2=m.rupees*100+m.paisa;
        int diff=p1-p2;
        result.rupees-=diff/100;
        result.paisa=diff%100;

        return result;
    }
}
public class RupeesPaisa {
    static void main(String[] args) {
        Money m1= new Money(15,75);
        Money m2= new Money(10,50);

        Money add=m1.addMoney(m2);
        Money sub=m1.subMoney(m2);

        System.out.print("Money 1: ");
        m1.showMoney();

        System.out.print("Money 2: ");
        m2.showMoney();

        System.out.print("Addition: ");
        add.showMoney();

        System.out.print("Subtraction: ");
        sub.showMoney();
    }
}
