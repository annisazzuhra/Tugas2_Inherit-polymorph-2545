package soal4;

/**
 * Kelas utama untuk menguji mini project toko digital.
 */
public class TesSoal4 {

    /**
     * Menjalankan pengujian produk dan keranjang belanja.
     *
     * @param args argumen program
     */
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();

        // Menambahkan produk ke keranjang
        keranjang.tambah(
            new ProdukFisik("F01", "Keyboard Mekanik", 500000, 1.5)
        );

        keranjang.tambah(
            new ProdukDigital("D01", "Ebook Java", 100000, 20)
        );

        keranjang.tambah(
            new Langganan("L01", "Kelas Online", 150000, 20, 12)
        );

        // Mencetak struk belanja
        keranjang.cetakStruk();

        // Menghitung produk berdasarkan jenis
        keranjang.hitungPerJenis();

        // Menguji exception ketika kode produk duplikat
        try {
            keranjang.tambah(
                new ProdukFisik("F01", "Mouse", 100000, 0.2)
            );
        } catch (IllegalStateException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}