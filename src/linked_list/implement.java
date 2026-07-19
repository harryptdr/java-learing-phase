package linked_list;
class sll{
    Node head;
    Node tail;
    int size;
    void addlast(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
    }
}
public class implement {
    public static void main(String[] args) {
        Node sll=new Node(5);


    }
}
