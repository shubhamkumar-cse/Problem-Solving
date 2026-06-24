public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtTail(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        int search(int val) {
            if (head == null) {
                return -1;
            }
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == val) {
                    return idx;
                }
                temp = temp.next;
                idx++;
            }
            return -1;
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

        void deleteAtHead() {
            if (head == null) {
                System.out.println("List is Empty.");
            }
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }

        void insert(int val, int idx) {
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid Index .");
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
            } else if (idx == size()) {
                insertAtTail(val);
            } else {
                Node temp = head;
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                Node n = new Node(val);
                n.next = temp.next;
                temp.next = n;
            }

        }

        void delete(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Invalid Index!");
                return;
            }

            if (idx == 0) {
                deleteAtHead();
                return;
            }

            Node temp = head;

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next; // delete node

            if (idx == size() - 1) { // deleting tail
                tail = temp;
            }

        }

    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
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
        System.out.println(list.search(30));
        list.insert(25, 2);
        list.display();
        list.delete(2);
        list.display();
    }
}