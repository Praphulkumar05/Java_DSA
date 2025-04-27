class Parent{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int X){
        x=X;

    }

}
class Child extends Parent{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int Y){
        y=Y;
    }
}
class Animal{
    int age;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age =a;
    }

}
class Dog extends Animal{
    public void Baark(){
        System.out.println("The Dog is barking to much..");

    }

}
class Base1{
    Base1(){
        System.out.println("From Base1: ");
    
    }
    Base1(int a){
        System.out.println("From Base1 with the value: "+a);
    }
}
class Derived extends Base1{
   
        Derived(){
            super(45);
           System.out.println("From Derived Class: ");

        }
    }
      
public class Inherit {
    public static void main(Stringggg[] args) {
      // Base1 b = new Base1(4);
     Derived d = new Derived();


        
    }
    
}
