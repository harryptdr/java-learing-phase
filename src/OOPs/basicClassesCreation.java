package OOPs;

public class basicClassesCreation {
    public static void print(student x){
        System.out.println(x.name);
        System.out.println(x.roll);
    }
    public static int change(student x){
        x.roll=24;
        return x.roll;
    }
    public static class student {
        String name;
        int roll;
        double percentage;
    }
    public static void main(String[] args) {
      student x=new student();
      x.name="raghv";
      x.roll=23;
      x.percentage=98.2;
      change(x);
       print(x);
    }
}
