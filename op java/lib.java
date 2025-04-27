class A {
    int radius;

    A(int r) {
        this.radius = r;
    }

    A() {
        System.out.println("From a non para");
    }

    public double area(int r) {
        return 3.14 * r * r;
    }
}

class B1 extends A {
    int height;

    B1(int r, int h) {
        super(r);
        this.height = h;
    }

    B1() {
        System.out.println("From B non para");
    }

    public double vol() {
        return 3.14 * radius * radius * height;
    }

}

class Rectangle {
    private int l, b, h;
    

    Rectangle(int length, int height, int breadth) {
        this.h = height;
        this.b = breadth;
        this.l = length;

    }

    Rectangle(){

    }
    public int getLen(){
        return l;
    } 
    public int getBre(){
        return b;

    }
    public int getHei(){
        return h;
    }
    public void setLen(int length){
        this.l=length;

    }
    public void setBre(int Breadth){
       this.b= Breadth;

    }
    public void setHei(int Height){
        this.h=Height;

    }

    public double Volu() {
        System.out.println("Volumne of Rect: ");
        return l*b*h;
    }
}


public class lib {
    public static void main(Stringggg[] args) {
        
        Rectangle r = new Rectangle();
        r.setBre(4);
        r.setHei(4);
        r.setLen(4);
        r.getBre();
        r.getHei();
        r.getLen();
        System.out.println(r.Volu());

        
        

    }
}





// class Cuboid extends Rectangle {
//     int w;

//     Cuboid(int width, int h, int l) {
//         super(l, h, width);
//         this.w = width;
//     }

//     public double area() {
//         System.out.println("Area of cuboid: ");
//         return 2 * (l * w + w * h + l * h);
//     }

//     public double Vol() {
//         System.out.println("Volumne of cuboid: ");
//         return l * b * w;
//     }

// }
