import java.util.*;

public class third {
    // public static class Student{
    // int age;
    // String name;
    // int id;
    // public int getAge(){
    // return age;
    // }
    // public int getId(){
    // return id;
    // }

    // }

    // public static class Box{
    // int length;
    // int width;
    // int height;
    // public int getArea(int length,int width){
    // return length*width;

    // }
    // public int getVolume(int length,int width,int height){
    // return length*width*height;

    // }
    // }
    // public static class Student{
    // int age;
    // String name;
    // Student(){
    // System.out.println("Constructor is printing");
    // }
    // Student(int age,String name){
    // this.age=age;
    // this.name=name;
    // }
    // }
    public static int Sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum);

    }

    public static void main(String[] args) {
        // Student obj1 = new Student();
        // Student obj2 = new Student();
        // obj2.name="Student2";
        // obj2.age=22;
        // obj2.id=2;
        // // System.out.println(obj2.name);
        // // System.out.println(obj2.age);
        // // System.out.println(obj2.id);
        // System.out.println("Age: "+obj2.getAge());
        // System.out.println("Id: "+obj2.getId());
        // Box b1 = new Box();
        // System.out.print("Area: ");
        // System.out.println(b1.getArea(12, 12));
        // Box b2= new Box();
        // System.out.print("Volumne: ");
        // System.out.println(b2.getVolume(2, 2, 2));
        // Student s1 = new Student(2,"Student1");
        // System.out.println(s1.age);
        // System.out.println(s1.name);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum: " + Sum(arr));

    }

}
