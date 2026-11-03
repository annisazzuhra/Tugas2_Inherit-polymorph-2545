package soal3;

/**
 * Merepresentasikan garis yang memiliki titik awal dan titik akhir.
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis berdasarkan dua objek titik.
     * Menggunakan defensive copy agar perubahan objek luar
     * tidak memengaruhi titik yang disimpan dalam garis.
     *
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Membuat garis berdasarkan empat koordinat.
     *
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengambil salinan titik awal.
     *
     * @return salinan titik awal
     */
    public Titik getAwal() {
        return new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengubah titik awal dengan membuat salinan objek.
     *
     * @param awal titik awal baru
     */
    public void setAwal(Titik awal) {
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengambil salinan titik akhir.
     *
     * @return salinan titik akhir
     */
    public Titik getAkhir() {
        return new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Mengubah titik akhir dengan membuat salinan objek.
     *
     * @param akhir titik akhir baru
     */
    public void setAkhir(Titik akhir) {
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung panjang garis menggunakan method jarakKe().
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
     * Mengubah garis menjadi bentuk teks.
     *
     * @return titik awal dan titik akhir garis
     */
    @Override
    public String toString() {
        return awal.toString() + " - " + akhir.toString();
    }
}