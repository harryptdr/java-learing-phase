package OOPs;
class Student{
    //data security
      public  int rollno;
      public  String name;
     public String add;
    //setter method
    public void tosetrollno(int rollno){
        this.rollno=rollno;
    }
    public void tosetname(String roll){
        this.name=name;
    }
    public void tosetadd(String add){
        this.add=add;
    }
    //getter methiod
    public int getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getadd(){
        return add;
    }
}
public class getter
{
    public static void main(String[] args) {
     Student s1=  new Student ();
     s1.name="raghav";
     s1.rollno=223;
     s1.add="mi";
        System.out.println(s1.name);
    }
}
