class Human{
    public int bones;
    private String blood;
    public String getblood(){
    return this.blood   ;

    }
    public void setblood(String b){
        this.blood=b;

    }
}
class Person{
    private int age;
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name=n;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int a){
        this.age=a;

    }
}





public class abc{

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(15);
        p.setName("Akash");
        System.out.println(p.getAge());
        System.out.println(p.getName());
      
        
    }
}