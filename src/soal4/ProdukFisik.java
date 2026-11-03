package soal4;

/**
 * Merepresentasikan produk fisik yang memiliki berat dan ongkos kirim.
 */
public class ProdukFisik extends Produk {
    private double beratKg;

    private static final double ONGKOS_KIRIM_PER_KG = 10000;

    /**
     * Membuat produk fisik.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg berat produk dalam kilogram
     */
    public ProdukFisik(String kode, String nama, double hargaDasar,
                       double beratKg) {
        super(kode, nama, hargaDasar);

        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif.");
        }

        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga produk beserta ongkos kirim.
     *
     * @return harga dasar ditambah ongkos kirim
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Mengembalikan deskripsi produk fisik.
     *
     * @return deskripsi berat produk
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}