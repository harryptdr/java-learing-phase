package personalLinkList;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
public class display {
    public static void display(node head){
        node temp =head;
        if(temp==null)return;
        System.out.print(temp.val+" ");
        temp=temp.next;
        display(temp);
    }
    public static void addfirst(int data){
        node x=new node(data);
        size++;
        if(head==null){
            head=tail=x;
            return;
        }
        x.next=head;
        head=x;
    }
    public static node head;
    public static node tail;
    public  static int size;
    public static void main(String[] args) {
        node ll=new node(34);
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
          ll.next=a;
          a.next=b;
          b.next=c;
          display(a);
          addfirst(54);
          display(a);
        System.out.println(size);
    }
}
