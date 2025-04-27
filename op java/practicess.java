import java.util.*;
class Book {
    String title;
    String author;
    double price;

    void getDetails() {
        System.out.println("Title: " + title + "Author: " + author + "Price: " + price);
    }
}

class Studint {
    String name;
    int rollnumber;

    Studint(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;

    }

    void getDetails() {
        System.out.println("Name: " + name + "RollNumber: " + rollnumber);

    }

}

class Calculator {
    int a;
    int b;

    double a1;
    double a2;

    String p;
    String pp;

    Calculator() {
        a = 0;
        b = 0;

        a1 = 0.0;
        a2 = 0.0;
        p = "";
        pp = "";
    }

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a1, double a2) {
        return a1 + a2;
    }

    String sum(String p, String pp) {
        return p + pp;
    }
}

class Person{
    private String name;
    private int age;
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public void setName(String s){
    name=s;
    }
}

class Color{
    String color;
    int quantity;
    public void printinfo(){
        System.out.println(this.color=color);
        System.out.println(this.quantity=quantity);
    }
}
class Rectangle{
    int length;
    int breadth;
    int getArea(int length,int breadth){
        return length*breadth;
    }
}

class Car{
    int noOfGear;
    String color;
    Car(){

    }
    
    Car(int noOfGear,String color){
        this.noOfGear=noOfGear;
        this.color=color;
    }
    public void printCarInfo(){
        System.out.println("noOfGear: "+noOfGear);
        System.out.println("Color: "+color);
    }

}
class RaceCar extends Car{
    int maxSpeed;
    RaceCar(){

    }
    RaceCar(int maxSpeed){
        this.maxSpeed=maxSpeed;
        
    }
    public void printRaceCarInfo(){
        super.printCarInfo();
        System.out.println("maxSpeed: "+maxSpeed);
    }
}






public class practicess {
    public static void main(String[] args) {
       RaceCar c = new RaceCar();
        c.color="Red";
        c.noOfGear=3;
        c.maxSpeed=100;
       // c.printCarInfo();
        c.printRaceCarInfo();




        // Book obj= new Book();
        // obj.title="The Great Gatsby,";
        // obj.author="F.Scott Fitzgerald ,";
        // obj.price=10.99;

        // Book obj1= new Book();
        // obj1.title="To Kill a Mockungbird,";
        // obj1.author="Harper Lee ,";
        // obj1.price=12.99;
        // obj.getDetails();
        // obj1.getDetails();
        // Studint s = new Studint("John", 101);
        // // s.getDetails();
        // Calculator c = new Calculator();
        // System.out.println(c.sum("Hello", "World"));
        // System.out.println(c.sum(1.0, 1.0));
        // System.out.println(c.sum(4, 4));




    //     Person p = new Person();
    //     p.setName("Alice");
    //     p.setAge(10);
    //    System.out.println(p.getAge());
    // //    System.out.println(p.getName());
    // Color c = new Color();
    // c.color="Pink";
    // c.quantity=12;
    // c.printinfo();
    // Color c1= new Color();
    // c1.color="Black";
    // c1.quantity=13;
    // c1.printinfo();
    // Scanner sc = new Scanner(System.in);
    // int length=sc.nextInt();
    // int breadth=sc.nextInt();
    // Rectangle r = new Rectangle();
    // System.out.println(r.getArea(length, breadth));

    }

}