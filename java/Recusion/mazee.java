import java.util.*;

public class mazee {
    // Method to count the number of ways to reach the end of the maze
    // int ma(int sr, int sc, int er, int ec) {
    //     if (sr > er || sc > ec) return 0; 
    //     if (sr == er && sc == ec) return 1;
    //     int rightWays = ma(sr, sc + 1, er, ec);
    //     int downWays = ma(sr + 1, sc, er, ec);
    //     int totalWays = rightWays + downWays;
    //     return totalWays;
    // }
    int ma2(int row,int col){
        if(row<1||col<1)return 0;
        if(row==1&& col==1)return 1;
        int rightWays =ma2(row,col-1);
        int downWays=ma2(row-1,col);
        int totalWays=rightWays+downWays;
        return totalWays;
    }
    void printpath2(int row,int col,String s){
        if(row<1||col<1)return;
        if(row==1&& col==1){
            System.out.println(s);
            return;
        }
       if(row>1) printpath2(row-1, col, s+"R");
       if(col>1) printpath2(row, col-1, s+"D");


    }

    // Method to print all paths from start to end of the maze
    // void printpath(int sr, int sc, int er, int ec, String s) {
    //     if (sr > er || sc > ec) return; 
    //     if (sr == er && sc == ec) {
    //         System.out.println(s);
    //         return;
    //     }
    //     printpath(sr, sc + 1, er, ec, s + "R");
    //     printpath(sr + 1, sc, er, ec, s + "D");
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // mazee m = new mazee();
        // System.out.println("Number of ways: " + m.ma(1, 1, 3, 3));
        // System.out.println("Paths:");
        // m.printpath(1, 1, 3, 3, "");
        mazee m2=new mazee();
        System.out.println("Number of ways: "+m2.ma2(3, 3));
        System.out.println("Paths: ");
        m2.printpath2(3,3,"");
    }
}
