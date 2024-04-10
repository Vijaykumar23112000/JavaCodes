package DSA.LinkedList;

public class MyLinkedList {
    Node head;

    public void show() {
        if (getSize() == 0) 
            System.out.println("List is empty");
        else {
            Node n = head;
            while (n.getNext() != null) {
                System.out.print(n.getData() + " ");
                n = n.getNext();
            }
            System.out.print(n.getData());
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node node = new Node(data);
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Node node = head;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            temp = node.getNext();
            node.setNext(temp.getNext());
            temp = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        int len = 1;
        Node n = head;
        while (n.getNext() != null) {
            len++;
            n = n.getNext();
        }
        return len;
    }

}
