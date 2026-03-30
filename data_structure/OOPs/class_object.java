package OOPs;
class Student{
    String name;
    int id;
    int age;
    void studying(){
        System.out.println("student is studying");
    }
    void playing(){
        System.out.println("student is playing");
    }
}
public class class_object {
    public static void main(String[] args) {
        Student st= new Student();
        st.studying();
        st.playing();
    }
}
