
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getNAme() {
        return name;

    }

    public void setNAme(String n) {
        this.name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        this.salary = s;

    }
}

class Manager extends Employee {
    private double bonous;

    public Manager(String name, double salary, double bonous) {
        super(name, salary);
        this.bonous = bonous;
    }

    public double getBonous() {
        return bonous;
    }

    public void setBonous(double b) {
        this.bonous = b;
    }
}

public class c {
    public static void main(String[] args) {
        Manager m = new Manager("abc", 750000, 5000);
        System.out.println("Name: " + m.getNAme());
        System.out.println("Salary: " + m.getSalary());
        System.out.println("Bonous: " + m.getBonous());

        m.setNAme("XYZ");
        m.setSalary(80000);
        m.setBonous(5000);

        System.out.println("Updated:!!!");

        System.out.println("Name: " + m.getNAme());
        System.out.println("Salary: " + m.getSalary());
        System.out.println("Bonous: " + m.getBonous());

    }

}
