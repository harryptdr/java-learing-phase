package stack;

import java.util.Stack;

public class stackCopy {
    public static void main(String[] args) {
        Stack <Integer>st=new Stack<>();
        st.push(30);
        st.push(70);
        st.push(40);
        st.push(20);
        st.push(10);
        st.push(90);
        System.out.println(st);
        Stack <Integer>hp=new Stack<>();
        while(!st.isEmpty()){
            hp.push(st.pop());
        }
        System.out.println(hp);
        Stack <Integer> goal=new Stack<>();
        while(!hp.isEmpty()){
            goal.push(hp.pop());
        }
        System.out.println(goal);
    }
}
