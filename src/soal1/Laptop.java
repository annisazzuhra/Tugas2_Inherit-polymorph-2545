
package soal1;

/**
 * Merepresentasikan perangkat elektronik berupa laptop.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat objek laptop.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan lama garansi
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah diberikan diskon.
     *
     * @param diskonPersen persentase diskon
     * @return harga laptop setelah diskon
     * @throws IllegalArgumentException jika diskon di luar 0 sampai 100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > 100) {
            throw new IllegalArgumentException("Diskon harus antara 0 sampai 100 persen.");
        }

        return harga - (harga * diskonPersen / 100);
    }

    /**
     * Menampilkan informasi laptop.
     *
     * @return informasi perangkat, RAM, dan ukuran layar
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | RAM " + ramGb + " GB"
                + " | layar " + ukuranLayarInci + " inci";
    }
}
