package stack;

import java.util.Stack;

public class pushAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<5){
            st.push(i);
            i++;
        }
        System.out.println(st);
        Stack <Integer>temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(9);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
        Stack <Integer>temp2=new Stack<>();
        int pos=3;
        int new_element=78;
        while(st.size()<=pos){
            temp2.push(st.pop());
        }
        st.push(new_element);
        while(st.size()!=st.size()+1){
            st.push(temp2.pop());
        }
        System.out.println(st);
    }
}
