class Person{
    private String name;
    private int age;
   public  Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getAge(){
        return age;

    }
    public void setAge(int a){
        this.age=a;
    }

}
class Student extends Person{
            private int StudentId;
          public   Student(String name, int age, int studentId){
                super(name,age);
                this.StudentId=StudentId;
            }
            public int getID(){
                return StudentId;
            }
            public void setID(int id){
                this.StudentId=id;
            }
}
public class b {
    public static void main(String[] args) {
        // Person p = new Person("System Kumar", 25);
        Student student = new Student("John Doe", 20, 122122144);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("ID: "+student.getID());
        //System.out.println("Student ID: " + student.getStudentId());
    student.setAge(10);
    student.setName("PK");
    student.setID(122122122);
    System.out.println("Student Name: " + student.getName());
    System.out.println("Student Age: " + student.getAge());
    System.out.println("ID: "+student.getID());
        



        
    }
    
}
