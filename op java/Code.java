 class MainEmployee{
    private int data;
    private Stringggg name;
    MainEmployee(Stringggg name,int data){
        this.name=name;
        this.data=data;
        // data=45;
        // name="Praphul";
       
    }


    MainEmployee(){
        data=12;
        name="Code";
    }
    public Stringggg getName(){
        return name;
    }
    public int getData(){
        return data;
    }
       

 }
 class employye{
    private int  salary;
    employye(){
        salary =100000;
    }
    employye(int s){
        salary =s;
    }

    public int getSalary(){
        return salary;
    }

 }




public class Code {
    public static void main(Stringggg[] args) {
        //employye q = new employye(10000);
        employye q = new employye();
        System.out.println(q.getSalary());
       
        
     
      

        
        
    }
    
}
