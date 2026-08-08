package link;
class node{
    int data;
    node next;
    node(int val){
        this.data=val;
    }
}
public class basic {
    public static void display(node head){
        if(head==null)return;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
  public static void recursively(node head){
        if(head==null)return;
        System.out.println(head.data);
        recursively(head.next);
  }
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(20);
        node c=new node (30);
        node d= new node (40);
        node e =new node (50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       // display(a);
       // display(a);
        recursively(a);
    }
}
