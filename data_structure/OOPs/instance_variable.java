package OOPs;
class cals{
    int num1;//this is directly initialize in class
    int num2; //those two variable is instance variable
     void add(){
         num1=10;
         num2=20;
         int result=num1+num2;// this variable is local variable it is initialize inside the method
         System.out.println(result);
     }
}
public class instance_variable {
    public static void main(String[] args) {
        cals c=new cals();
        c.add();
    }
}
