
public class student {
    public static class Student {
        Stringggg name;
         int rollno;
        double percentage;
        static int numberOfStudents;



        // public Student(String naam,int rno,int per){             //Parameterised const.
        //     name=naam;
        //     rollno=rno;
        //     percentage=per;

        // }

        public Student(){               //default const.

        }
        
        public Student(Stringggg name,int rollno,double percentage){
            this.name=name;
            this.rollno=rollno;
            this.percentage=percentage;
            numberOfStudents++;
        }

        // public int GetRoll() { /// Getter used to get/print something that have private attribute.
        //     return rollno;
        // }

        // public void SetRoll(int rollno) { /// setter is used to update or give the value to the attribute that have
        //                                   /// private properties.
        //     this.rollno = rollno;

        // }

    }

    public static void print(Student s) {
        // s.name="kumar system";
        System.out.println(s.name);
    }

    public static void main(Stringggg[] args) {
        //Student s = new Student("Babblu",4,82);
        Student s1=new Student("Priya",15,96);
        // System.out.println(s1.name); 
        // System.out.println(s1.rollno); 
        // System.out.println(s1.percentage); 
        System.out.println(s1.numberOfStudents);
             
        Student s2= new Student("Rahul",7,89);
        // System.out.println(s2.name);
        // System.out.println(s2.rollno);
        // System.out.println(s2.percentage);
        System.out.println(s2.numberOfStudents);

       

        // s.name = "System kumar";
        // s.percentage = 96.3;
        // s.SetRoll(68);
        // System.out.println(s.GetRoll());

        // System.out.println(s.GetRoll());
        // s.rollno=41;
        // print(s);
        // System.out.println(s.rollno);

    }

}
