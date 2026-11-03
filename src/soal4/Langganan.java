package soal4;

/**
 * Merepresentasikan produk langganan yang merupakan turunan ProdukDigital.
 */
public class Langganan extends ProdukDigital {
    private int durasiBulan;

    private static final int BATAS_DISKON_BULAN = 12;
    private static final double DISKON_LANGGANAN = 0.20;

    /**
     * Membuat produk langganan.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar per bulan
     * @param ukuranMb ukuran produk dalam MB
     * @param durasiBulan lama berlangganan
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);

        if (durasiBulan <= 0) {
            throw new IllegalArgumentException(
                "Durasi langganan harus lebih dari nol."
            );
        }

        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga langganan berdasarkan durasi.
     * Diskon 20 persen diberikan jika durasi minimal 12 bulan.
     * Diskon digital tidak diterapkan pada langganan.
     *
     * @return harga akhir langganan
     */
    @Override
    public double hitungHargaAkhir() {
        double total = hargaDasar * durasiBulan;

        if (durasiBulan >= BATAS_DISKON_BULAN) {
            total = total * (1 - DISKON_LANGGANAN);
        }

        return total;
    }

    /**
     * Mengembalikan deskripsi produk langganan.
     *
     * @return deskripsi durasi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}