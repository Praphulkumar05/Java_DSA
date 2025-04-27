class Anumal{
    public void sound(){
        System.out.println("Animal's sound");
    }
}
class Dog extends Anumal{
    public void sound(){
        System.out.println("Dog is barking: ");
    }
}

// class Vehcile{
//     public void move(){
        
//             System.out.println("Vehcile is moving: ");
//     }

// }
// class Car extends Vehcile{
//     public void move(){
//         super.move();
//         System.out.println("Car is moving: ");
//     }
// }
// class ElectricCar extends Car{
//     public void move(){
//         super.move();
//         System.out.println("Electric Car is moving: ");
//     }
// }

class Shape{
    public void draw(){
        System.out.println("Shape is drawing: ");

    }
}
class Circle extends Shape{
    public void draw(){
        //super.draw();
        System.out.println("Circle is drawing: ");
    }
}
class Rect extends Shape{
    public void draw(){
        super.draw();
        System.out.println("Rect is drawing: ");
    }
}


public class p{
    class Vehcile{
        public void move(){
            
                System.out.println("Vehcile is moving: ");
        }
    
    }
    class Car extends Vehcile{
        public void move(){
            super.move();
            System.out.println("Car is moving: ");
        }
    }
    class ElectricCar extends Car{
        public void move(){
            super.move();
            System.out.println("Electric Car is moving: ");
        }
    }
    
    public static void main(String[] args) {
        p outer = new p();
        ElectricCar c = outer.new ElectricCar();
        c.move();
        
       
        
        
    }
}