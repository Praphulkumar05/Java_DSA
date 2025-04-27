import java.util.*;;
class Person{
    String name;
    int age;
    public  Person(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person{
    int salary;
    public Employee(String name,int age,int salary){
        super(name,age);
        this.salary=salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
   
     

}
class Vehcilee{
    double mileage;
    String name;
   public Vehcilee(double mileage,String name){
        this.mileage=mileage;
        this.name=name;
    }
    public void display(){
        System.out.println("Car runs with this mileage: " +mileage);
        System.out.println("Car name is : "+name);
    }
}
class Model extends Vehcilee{
    String model;
    public Model(double mileage,String name,String model){
        super(mileage,name);
        this.model = model;


    }
    public void display(){
        super.display();
        System.out.println("Model of the car is : "+model);
    }

} 
class Bank{
  

    public double  getInterestRate(){
        System.out.println("Normal bank: ");
        return 5.0;
    }
}
class SBI extends Bank{
    public double getInterestRate(){
       // super.getInterestRate();
        System.out.println("SBI bank");
        return 7.0;
    }
}
class ICIC extends Bank{
    public double getInterestRate(){
        //super.getInterestRate();
        System.out.println("ICIC bank");
        return 6.0;
    }
}




public class inter {
    public static void main(String[] args) {
        SBI s = new SBI();
       System.out.println("Interest of SBI bank is "+ s.getInterestRate());
       ICIC i = new ICIC();
       System.out.println("Interest of ICIC bank is: "+i.getInterestRate());


        

      
       
        
    }
    
}
