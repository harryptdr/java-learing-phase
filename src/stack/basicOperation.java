package stack;
import java.util.Stack;
public class basicOperation {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        //push the element in stack and add element in last
        st.push(10);
        st.push(20);
        int i=1;
        while(i<5){
            st.push(i*6);
            i++;
        }
        System.out.println(st);
        //pop is remove the last element
        st.pop();
        System.out.println(st);
        st.push(90);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        //peek is return a value in last not remove
        System.out.println(st.peek());
    }
}
