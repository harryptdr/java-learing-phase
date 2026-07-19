package stack;

import java.util.Stack;

public class recursiveStack {
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty())return;
        int temp=st.pop();
        System.out.print(temp+" ");
        reverse(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        System.out.println(st);
        reverse(st);
    }
}
