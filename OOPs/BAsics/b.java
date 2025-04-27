import javax.sound.midi.MidiEvent;

public class b {
    public static class Person{
        Stringggg name;
        int age;
        Person(Stringggg name,int age){
            this.name=name;
            this.age=age;
        }
        public  void displayInfo(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    }


    public static class Rectangle{
        int length;
        int breadth;
        Rectangle(int length,int breadth){
            this.length=length;
            this.breadth = breadth;
        }
        public int area(){
            return length*breadth;
        }
    }
    public static class Car{
        int price;
        Stringggg model;
        int year;
        Car(){
            model="I10";
            price=500000;
            year=2003;
        }
        Car(int price,Stringggg model,int year){
            this.price=price;
            this.model=model;
            this.year = year;
        }
        public void display(){
            System.out.println("Price: "+price);
            System.out.println("Model: "+model);
            System.out.println("Year: "+year);
        }
    }

    public static class Student{
        int marks;
        Stringggg name;
        int rollno;
        Student(Stringggg name,int rollno){
            this.name=name;
            this.rollno=rollno;

        }
        Student(Stringggg name,int rollno,int marks){
            this.name=name;
            this.rollno=rollno;
            this.marks=marks;
        }
        public void displayy(){
            System.out.println("Name: "+name);
            System.out.println("Rollno: "+rollno);
            System.out.println("Marks: "+marks);
    
        }
    }

    public static class Movie{
        int rating;
        Stringggg title;
        Stringggg director;
        Movie(int rating){
            this.rating=rating;
        }
        Movie(Stringggg title,Stringggg director){
            this.title=title;
            this.director=director;

        }
        Movie(int rating,Stringggg title,Stringggg director){
           this.rating=rating;
           this.title=title;
           this.director=director;
        }
        public void display(){
            System.out.println("Rating: "+rating);
            System.out.println("Title: "+title);
            System.out.println("Director: "+director);
        }
    }
   
    public static void main(Stringggg[] args) {
        Movie m1 = new Movie(4);
        m1.display();
        Movie m2= new Movie("Singham", "Rohit Shetthy");
        m2.display();
        Movie m3 = new Movie(5, "Stree2", "R RAjkumar");
        m3.display();


      

      

        
        
       

        
    }
    
}
