
import java.util.*;

class Bank {
    Stringggg BANK_Name;
    Stringggg Name_Holder;
    // double remaining_amount;
    int id;
    double Total_amount;
    Stringggg message;
    Stringggg Date;
    double amount_withdra;

    Bank() {

    }

    Bank(double Total_amount) {
        this.Total_amount = Total_amount;

    }

    public Stringggg getBANKNAME() {
        return BANK_Name;
    }

    public void setBANKNAME(Stringggg bn) {
        BANK_Name = bn;
    }

    public Stringggg getNAmeHolder() {
        return Name_Holder;
    }

    public void setNameHolder(Stringggg n) {
        Name_Holder = n;
    }

    public double getAmount(double amount_withdra) {
        return Total_amount - amount_withdra;
    }

    public int getID() {
        return id;
    }

    public void setID(int i) {
        id = i;
    }

    public double getTOTALAMOUNT() {
        return Total_amount;
    }

    public void setTOTALAMOUNT(double Total_amount) {
        this.Total_amount = Total_amount;
    }

    public Stringggg getMESSAGE() {
        return message;
    }

    public void setMESSAGE(Stringggg m) {
        this.message = m;
    }

    public Stringggg getDate() {
        return Date;
    }

    public void setDate(Stringggg date) {
        this.Date=date;
    }

}

public class transaction {
    public static void main(Stringggg[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Bank b1 = new Bank();
        b1.setTOTALAMOUNT(100000.0);
        b1.setBANKNAME("SBI BANK : ");
        b1.setMESSAGE("THANKS FOR YOUR SUPPORT: ");
        b1.setDate("05-09-2024");
      
        b1.setID(1000 + random.nextInt(9000));

        System.out.println("Welcome Buddy TO , ");
        System.out.println(b1.getBANKNAME());
        System.out.println("Enter your name: ");
        b1.setNameHolder(sc.nextLine());
        System.out.println("You want to Take out some cash?    Yes/No");
        Stringggg per = sc.nextLine();
        if (per.equals("Yes")) {
            System.out.println("Current Balamce: " + b1.getTOTALAMOUNT());
            System.out.println("Enter the Amount you want to withdraw: ");
            double w = sc.nextDouble();
            double vail = b1.getAmount(w);
            System.out.println("Remaining Balance: " + vail);
            System.out.println("Transaction-ID: " + b1.getID());
            // System.out.println("Transaction-Date: "+b1.getDAte(););
            System.out.println(b1.getMESSAGE());

        } else {
            System.out.println("Have a nice day: ");
        }

    }

}
