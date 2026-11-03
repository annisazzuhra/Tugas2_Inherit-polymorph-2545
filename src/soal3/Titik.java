package soal3;

/**
 * Merepresentasikan sebuah titik dalam koordinat dua dimensi.
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Membuat titik pada koordinat (0, 0).
     */
    public Titik() {
        this(0, 0);
    }

    /**
     * Membuat titik berdasarkan koordinat x dan y.
     *
     * @param x koordinat horizontal
     * @param y koordinat vertikal
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil koordinat x.
     *
     * @return nilai koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengubah koordinat x.
     *
     * @param x koordinat horizontal baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengambil koordinat y.
     *
     * @return nilai koordinat y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah koordinat y.
     *
     * @param y koordinat vertikal baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak antara titik ini dan titik lain.
     *
     * @param lain titik tujuan
     * @return jarak antara kedua titik
     */
    public double jarakKe(Titik lain) {
        double dx = this.x - lain.x;
        double dy = this.y - lain.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Mengubah koordinat titik menjadi bentuk teks.
     *
     * @return koordinat dalam format (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}