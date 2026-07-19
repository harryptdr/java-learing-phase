package stack;

import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> hp=new Stack<>();
        int i=1;
        while(i<=10){
            st.push(i*10);
            i++;
        }
        System.out.println(st);
        while(!st.isEmpty()){
            hp.push(st.pop());
        }
        System.out.println(hp);


    }
}
