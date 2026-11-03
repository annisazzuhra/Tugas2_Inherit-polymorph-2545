package soal2;

/**
 * Merepresentasikan kucing sebagai turunan dari kelas Hewan.
 */
public class Kucing extends Hewan {

    /**
     * Membuat objek kucing.
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Menampilkan suara khas kucing.
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Menampilkan aktivitas memanjat.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}