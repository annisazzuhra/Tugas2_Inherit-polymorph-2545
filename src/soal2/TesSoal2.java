package soal2;

/**
 * Kelas utama untuk menguji seluruh bagian pada Soal 2.
 */
public class TesSoal2 {

    /**
     * Menjalankan pengujian inheritance dan polymorphism.
     * @param args argumen program
     */
    public static void main(String[] args) {

        // BAGIAN A
        System.out.println("=== BAGIAN A ===");

        Hewan h = new Kucing("Tom");

        h.makan();
        h.suara();

        // h.panjat(); // Error kompilasi karena tipe referensi Hewan

        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");

        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("h2 bukan objek Kucing");
        }

        // BAGIAN B
        System.out.println("\n=== BAGIAN B ===");

        new B();

        // BAGIAN C
        System.out.println("\n=== BAGIAN C ===");

        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}