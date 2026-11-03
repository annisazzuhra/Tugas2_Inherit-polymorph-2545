package soal2;

/**
 * Kelas induk untuk menguji urutan pemanggilan constructor.
 */
public class A {

    /**
     * Membuat objek A dan memanggil method init().
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Menampilkan pesan inisialisasi kelas A.
     */
    public void init() {
        System.out.println("init A");
    }
}