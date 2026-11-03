package soal4;

/**
 * Kelas induk yang merepresentasikan produk toko digital.
 */
public abstract class Produk {
    private String kode;
    private String nama;
    protected double hargaDasar;

    /**
     * Membuat objek produk.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @throws IllegalArgumentException jika nama kosong atau harga negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong.");
        }

        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif.");
        }

        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
        }

        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Menghitung harga akhir produk.
     *
     * @return harga akhir produk
     */
    public abstract double hitungHargaAkhir();

    /**
     * Mengembalikan deskripsi jenis produk.
     *
     * @return deskripsi produk
     */
    public abstract String deskripsi();
}