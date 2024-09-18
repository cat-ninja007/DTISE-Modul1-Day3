package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListV2 list = new LinkedListV2(); // Membuat rak buku yang baru

        // Menambahkan buku ke rak
        list.insert("The Catcher in The Rye");
        list.insert("Pride and Prejudice");
        list.insert("To Kill a Mockingbird");
        list.insert("Echoes of the Forgotten");
        list.insert("Beneath the Starlit Sky");
        list.insert("The Clockwork Garden");
        list.insert("Chasing the Serpent's");
        list.insert("Chasing the Serpent's");

        // Menampilkan rak buku
        System.out.println("Rak Buku:");
        list.display();

        // Menghpaus buku "Pride and Prejudice"
        System.out.println("\n Menghapus 'Beneath the Starlit Sky': ");
        list.delete("Beneath the Starlit Sky");
        list.display();
    }
}
