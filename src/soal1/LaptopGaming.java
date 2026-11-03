
package soal1;

/**
 * Merepresentasikan laptop gaming dengan kartu grafis khusus.
 */
public class LaptopGaming extends Laptop {
    private String kartuGrafis;

    private static final int TAMBAHAN_GARANSI_BULAN = 6;

    /**
     * Membuat objek laptop gaming dengan tambahan garansi.
     *
     * @param merek merek laptop gaming
     * @param harga harga laptop gaming
     * @param garansiBulan lama garansi awal
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis jenis kartu grafis
     */
    public LaptopGaming(String merek, double harga, int garansiBulan,
                        int ramGb, double ukuranLayarInci,
                        String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI_BULAN,
                ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Menampilkan informasi laptop gaming.
     *
     * @return informasi laptop dan kartu grafis
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | GPU " + kartuGrafis;
    }
}
