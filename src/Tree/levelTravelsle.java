package Tree;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.ArrayDeque;
import java.util.Queue;

public class levelTravelsle {
    public static void display(node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }

    public static void level(node root){
        Queue<node> ans= new ArrayDeque<>();
        if(root!=null)ans.add(root);
        while(ans.size()>0){
            node front=ans.remove();
            System.out.print(front.val+" ");
            if(front.right!=null)ans.add(front.right);
            if(front.left!=null) ans.add(front.left);

       //left to right krne ke liye left aage aayega
       // right to left krne ke liye right uper aayega
        }
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
        System.out.println();
        level(a);
    }
}
