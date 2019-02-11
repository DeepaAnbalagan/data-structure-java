package LinkedList;

public class LinkedList {
    // to understand static keyword in java
    static private String str = "Deepa";
    Node head;

    public static void main(String args[]) {
        //Static class doesn't require outer class object
        // LinkedList.Node list = new LinkedList.Node(1);
        LinkedList list = new LinkedList();
        // to validate static key word properties
        // list.print();
        list.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        two.next = three;
        three.next = four;
        list.head.next = two;
        list.printList(list.head);
        System.out.println(list.toString());
        while (list.head != null) {
            System.out.println(list.head.data);
            list.head = list.head.next;
        }

        //System.out.println(list.head.data);
    }

    void printList(Node list) {
        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }
    }

    void insertFirst(Node list, int newValue) {
        Node newNode = new Node(newValue);

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void print() {
            System.out.println("Welcome static msg" + str);
        }
    }
}
