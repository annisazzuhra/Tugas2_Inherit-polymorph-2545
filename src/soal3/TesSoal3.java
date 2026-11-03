package soal3;

/**
 * Kelas utama untuk menguji composition dan defensive copy.
 */
public class TesSoal3 {

    /**
     * Menjalankan pengujian kelas Titik dan Garis.
     *
     * @param args argumen program
     */
    public static void main(String[] args) {

        // Pengujian constructor dengan koordinat
        Garis g = new Garis(0, 0, 3, 4);
        System.out.println(g + " panjang=" + g.getPanjang());

        // Pengujian composition dan defensive copy
        Titik t = new Titik(1, 1);
        Garis g2 = new Garis(t, new Titik(5, 5));

        t.setX(100);

        System.out.println(g2);
    }
}