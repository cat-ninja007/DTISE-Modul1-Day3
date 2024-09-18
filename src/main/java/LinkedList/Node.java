package LinkedList;

public class Node {
    String data;  // Judul buku
    Node next;    // Pointer (tali) ke buku berikutnya

    // Konstruktor untuk membuat node (buku) baru
    public Node(String data) {
        this.data = data;      // Mengisi data dengan judul buku
        this.next = null;      // Awalnya tidak terhubung ke node lain
    }
}
