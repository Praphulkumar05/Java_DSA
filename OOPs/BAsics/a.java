

public class a {
    public static class Book{
        int price;
        Stringggg Author;
        Stringggg title;
        Book(int price,Stringggg Author,Stringggg title){
            this.price=price;
            this.Author=Author;
            this.title=title;
        }
    }
    public static void change(Book  q){
        q.Author="Rahul";
        q.price=1000;
        q.title="Bad Boys";
        System.out.println(q.Author);
        System.out.println(q.title);
        System.out.println(q.price);

    }
    
   
    public static void main(Stringggg[] args) {
        Book b = new Book(500, "Matatma Gandhi", "Salt Satyagrah");
        System.out.println(b.Author);
        System.out.println(b.price);
        System.out.println(b.title);
        change(b);

        // Book b1 = new Book(600, "HC VERMA", "SCIENCE");
        // System.out.println(b1.Author);
        // System.out.println(b1.price);
        // System.out.println(b1.title);;

        // Book b2 = new Book(700, "RD shama", "Math");

        // System.out.println(b2.Author);
        // System.out.println(b2.price);
        // System.out.println(b2.title);

        
    }
    
}
