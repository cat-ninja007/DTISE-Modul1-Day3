package LinkedList;

public class LinkedListV2 {
    Node head; // Buku pertama di rak

    // Metode untuk menambahkan buku baru di rak
    public void insert(String data){
        Node newNode = new Node(data); // Membuat buku baru

        if(head == null){
            head = newNode;
        } else {
            Node current = head; // Kita pasang point untuk menelusuri
            while(current.next !=  null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Metode untuk menampilkan semua buku di rak
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    // Metode untuk menghapus buku dengan judul tertentu
    public void delete(String data){

        if(head == null){
            System.out.println("Rak buku kosong");
            return;
        }

        //JIka buku pertama yang harus dihapus
        if(head.data.equals(data)){
            head = head.next; // pindahkan head ke buku berikutnya
            return;
        }

        // Jika bukan di buku yang pertama
        Node current = head;
        Node previous = null;

        while(current != null && !current.data.equals(data)){
            previous = current;
            current = current.next;
        }

        // Jika buku ditemukan, hapus buku dengan memutuskan koneksi
        if(current != null){
            previous.next = current.next;
        }
    }

}

