package OOPs;
import OOPs.student;
public class publicprivate {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="hariom";
       // s1.roll=123;
        s1.getRoll();
        s1.pecentage=59.3;
        System.out.println(s1.getRoll());
        s1.setRoll(67);
        System.out.println(s1.getRoll());
    }
}
