

public class ff {
    public static void main(String[] args) {
        String str="Programming";
        int vcount=0;
        int concount=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vcount++;
            }else{
                concount++;
            }
        }
        System.out.println("Vovels: "+vcount);
        System.out.println("Con: "+concount);
    }
    
}
