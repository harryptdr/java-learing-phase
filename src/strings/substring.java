package strings;

public class substring {
    public static void main(String[] args) {
        String s="hariom";
        System.out.println(s.substring(3));//3 or uske bad sare element print honge
        System.out.println(s.substring(1,4));
        for(int i =0; i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                System.out.print((s.substring(i,j))+" ");
            }
            System.out.println();
        }
    }
}
