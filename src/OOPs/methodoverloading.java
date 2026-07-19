package OOPs;
class test{
    public static void add(int a,int b){
        System.out.println(a+b+"this is int argumnet ");
    }
    public static void add(float a, float b) {
        System.out.println(a + b + " float type argumnet ");
    }
    public static void add(double a, double b){
        System.out.println(a+b +" double argument");
    }
    public static void add(double a){
        System.out.println("double argumnegt");
    }
}
public class methodoverloading {

    public static void main(String[] args) {
         test.add(10,20);
          test.add(3.34f,3.5f);
          test.add(324628464,290472942);
          //compiler deside what kind of date type are send to as a argument
        test.add('a');//this type argument is char but compiler is impicite type cast and send the as a argument
    }
}
