public class Implementation{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtTail(int val){
            Node temp=new Node(val);
            if (head ==null) {
                 head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
        else{
            temp.next=head;
            head=temp;
        }
        }
        void deleteAtHead(){
            if(head ==null){
                System.out.println("List is Empty.");
            }
            head=head.next;
            if(head==null){
                tail=null;
            }
        }
        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }
    
    }

    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        list.display(); 

        System.out.println("Size = " + list.size());
        list.insertAtHead(9);
        list.display();
        list.deleteAtHead(); 
        list.display();
    }
}