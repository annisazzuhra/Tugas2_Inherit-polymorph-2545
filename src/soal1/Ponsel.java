
package soal1;

/**
 * Merepresentasikan perangkat elektronik berupa ponsel.
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat objek ponsel.
     *
     * @param merek merek ponsel
     * @param harga harga ponsel
     * @param garansiBulan lama garansi
     * @param kapasitasGb kapasitas penyimpanan dalam GB
     * @param jumlahKamera jumlah kamera
     */
    public Ponsel(String merek, double harga, int garansiBulan,
                  int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Menampilkan informasi ponsel.
     *
     * @return informasi perangkat, kapasitas, dan jumlah kamera
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | " + kapasitasGb + " GB"
                + " | " + jumlahKamera + " kamera";
    }
}
