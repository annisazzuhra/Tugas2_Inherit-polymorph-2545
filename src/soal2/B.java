package soal2;

/**
 * Kelas B merupakan turunan dari kelas A.
 */
public class B extends A {
    int nilai = 5;

    /**
     * Membuat objek B.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Mengubah implementasi method init() dari kelas A.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}