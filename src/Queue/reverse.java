package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse {
    static Queue<Integer> que;
    public  static void reverse(){
        Stack<Integer> st=new Stack<>();
        while(!que.isEmpty()){
          st.push(que.remove());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
    }
    public static void main(String[] args) {

        que=new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        que.add(80);
        que.add(90);
        System.out.println(que);
        reverse();
        System.out.println(que);
    }
}
