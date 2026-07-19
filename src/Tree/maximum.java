package Tree;
public class maximum {
    private static void display(node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int  Maxim(node root){
        if(root==null)return Integer.MIN_VALUE;
        int a=root.val;
        int b=Maxim(root.left);
        int c=Maxim(root.right);
        return Math.max(a,Math.max(b,c));
    }
    private static int  mini(node root){
        if(root==null)return Integer.MAX_VALUE;
        int a=root.val;
        int b=mini(root.left);
        int c=mini(root.right);
        return Math.min(a,Math.min(b,c));
    }
    private static int size(node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    private static int level(node root){
        if(root==null)return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        node c=new node(3);
        node d=new node(4);
        node e=new node(2);
        node f=new node(110);
        node h=new node(7);
        c.left=d;
        c.right=e;
        d.left=f;
        e.right=h;
        display(c);
        System.out.println();
        System.out.println(Maxim(c));
        System.out.println(mini(c));
        System.out.println(size(c));
        System.out.println(level(c));
    }
}
