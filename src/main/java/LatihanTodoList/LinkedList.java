package LatihanTodoList;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Menambahkan Node di akhir
    public void add(int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    // Menambahkan Semua Elemen Linked List
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
}
