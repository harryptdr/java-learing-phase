package recursion;

public class traversalinstring {
    public static void print(int i,String s,String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='i'){
            ans+=s.charAt(i);
            print(i+1,s,ans);
        }
        else{
            print(i+1,s,ans);
        }
    }
    public static void main(String[] args) {
        String s="hariom patidar";
        print(0,s,"");
    }
}
