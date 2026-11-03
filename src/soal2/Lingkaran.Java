package soal2;

/**
 * Merepresentasikan bangun lingkaran.
 */
public class Lingkaran {
    protected double jariJari;

    /**
     * Membuat objek lingkaran.
     * @param jariJari ukuran jari-jari lingkaran
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     * @return hasil perhitungan luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     * @return hasil perhitungan keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}