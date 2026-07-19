package Tree;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class basic {
    private static int product(node root){
       if(root==null) return 1;
       if(root.val==0)return 1;//non zero val product case
        return root.val*product(root.left)*product(root.right);
    }
    private static int sum(node root){
        if(root==null)return 0;

        return root.val+sum(root.left)+sum(root.right);
    }
    private static void display(node root){
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
        node e=new node(0);
        node f=new node(0);
        node h=new node(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=h;
        display(a);
        System.out.println();
        int n=sum(a);
        System.out.println(n);
         int m=product(a);
        System.out.println(m);
    }
}
