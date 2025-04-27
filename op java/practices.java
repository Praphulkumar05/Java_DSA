
class Cylinder {
    private int radius;
    private int height;
    public Cylinder(){
        
        height=23;
        radius=19;
    


    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;

    }

    public int getHeight() {
        return height;

    }

    public void setHeight(int h) {
        height = h;
    }

    public double Surface() {
        double result = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
        return result;
    }

    public double volume() {
        double result2 = 3.14 * radius * radius * height;
        return result2;
    }

}


class Rectanglle{
    private int length;
    private int breadth;
  public   Rectanglle(){
        this.length =4;
        this.breadth=5;
    }
    public Rectanglle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public void print(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}

public class practices {
    public static void main(Stringggg[] args) {
        Cylinder c = new Cylinder();
        // c.setRadius(23);
        // System.out.println(c.getRadius());
        // c.setHeight(10);
        //System.out.println(c.getHeight());
        // System.out.println("Surface: "+c.Surface());
        // System.out.println("Volumne: "+c.volume());
        Rectanglle r = new Rectanglle(12,13);
        r.print();
        

    }

}
