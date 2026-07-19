package linked_list;

public class displaylinkedlist {
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void display(Node head){
        if(head==null)return;
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(2340);
        Node c=new Node(330);
        Node d=new Node(450);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
        display(a);

    }
}
