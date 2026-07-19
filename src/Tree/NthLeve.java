package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class NthLeve {
    public static void display(node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
        public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        node f=new node(6);
        node h=new node(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=h;
        display(a);
    }
}
