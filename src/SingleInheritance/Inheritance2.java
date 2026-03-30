//Create a class Vehicle as follows :
//Data members (All are private) –[Brand, Country_of_Origin, Base_price]
//Methods - input (to input details of vehicle) and display (to show vehicle details).
//Create a sub class Car as follows:Data members – [Model, speed, Market_price]
//[NB: Market price of a car can be calculated from the Base price and speed. If
//speed is above 80km/hr, market price will be 15% more than the base price
//otherwise market price will be 5% less than the base price.]
//Methods – read (to input car details) and show (to show car details).
//In addition to above methods add more appropriate methods to set therequired data members.
//Now create objects. Input required data and show the details (Brand,Country_of_Origin, Base_price, Model, speed, Market_price) of any car.

package SingleInheritance;

import java.util.Scanner;

class Vehicle{
    private String Brand;
    private String Country_of_origin;
    private double base_price;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Brand: ");
        Brand=sc.nextLine();
        System.out.print("Enter Country_of_origin: ");
        Country_of_origin=sc.nextLine();
        System.out.print("Enter base_price: ");
        base_price=sc.nextDouble();
    }
    public String getBrand(){
        return Brand;
    }
    public String getCountry_of_origin(){
        return Country_of_origin;
    }
    public double getBase_price(){
        return base_price;
    }
    void display(){
        System.out.println("Brand: "+Brand);
        System.out.println("Country_of_origin: "+Country_of_origin);
        System.out.println("base_price: "+base_price);
    }
}
class Car extends Vehicle{
    private String model;
    private int speed;
    private double market_price;

    public void read(){
        Scanner sc=new Scanner(System.in);
        input();
        System.out.print("Enter Model: ");
        model=sc.nextLine();
        System.out.print("Enter Speed: ");
        speed=sc.nextInt();
        calculateMarketPrice();
    }
    private void calculateMarketPrice(){
        double base = getBase_price();
        if(speed>80){
            market_price=base + (0.15 * base);
        }
        else{
            market_price=base - (0.15 * speed);
        }
    }
    public void show(){
        display();
        System.out.println("Model: "+model);
        System.out.println("Speed: "+speed + "km/hr");
        System.out.println("Market Price: "+market_price);
    }
}
public class Inheritance2 {
    static void main(String[] args) {
        Car c=new Car();
        c.read();
        System.out.println("\n---- Car Details ----");
        c.show();
    }
}
