
public class DisplayLinkedlist {
    public static class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
}
}
    public static void Display(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+ "->");
        temp=temp.next;
    }
    System.out.print("null");
}
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
      
        a.next=b;
        b.next=c;
        c.next=d;
        Display(a);
    }
}
