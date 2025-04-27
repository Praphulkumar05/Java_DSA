
public class basic {
    public static class Student {
        int rollno;
        String name;

        public void printInfoo(int rollno) {
            System.out.println("Roll: " + rollno);
        }

        public void printInfoo(String name) {
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        
        s.printInfoo("Aman");
        s.printInfoo(12);

    }

}
