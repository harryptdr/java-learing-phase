package recursion;

public class basics {
    public static void mango(){
        System.out.println(" i am a mango");
    }
    public static void banna(){
        System.out.println(" i am a banna");
        mango();
    }
    public static void apple(){
        mango();
        System.out.println("i am a apple");
        banna();
    }
    public static void main(String[] args) {
        System.out.println("i am a main");
        apple();
    }
}
