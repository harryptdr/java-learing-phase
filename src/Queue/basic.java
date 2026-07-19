package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class basic {
    public static void main(String[] args) {
        Queue <Integer> que= new ArrayDeque<>();
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
        System.out.println(que.size());
        System.out.println(que.remove());
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.isEmpty());

    }
}
