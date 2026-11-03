package soal2;

/**
 * Merepresentasikan objek hewan sebagai kelas induk.
 */
public class Hewan {
    protected String nama;

    /**
     * Membuat objek hewan.
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Menampilkan suara hewan.
     */
    public void suara() {
        System.out.println("...");
    }

    /**
     * Menampilkan aktivitas makan dan memanggil suara hewan.
     */
    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}