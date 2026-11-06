# Tugas 2 Praktikum PBO: Inheritance, Composition, dan Polimorfisme

## 1. Identitas

- **Nama Tugas:** Tugas 2 - Inheritance, Composition, dan Polimorfisme
- **Nama Lengkap:** Annisa Azzuhra Maghfirah
- **NPM:** 2508107010002545
- **Kelas Praktikum:** Praktikum Pemrograman Berorientasi Objek Kelas A
- **Repository:** https://github.com/annisazzuhra/Tugas2_Inherit-polymorph-2545.git

## Deskripsi Singkat

Tugas ini berisi empat soal latihan Java tentang inheritance, composition, dan polimorfisme. Soal 1 membahas pewarisan pada hierarki perangkat elektronik, Soal 2 membahas analisis output, error, dan polimorfisme, Soal 3 membahas composition pada objek titik dan garis, sedangkan Soal 4 menggabungkan beberapa konsep OOP dalam mini project toko digital.

## Fitur Utama

- **Soal 1 (Perangkat Elektronik):** Membuat objek laptop, ponsel, dan laptop gaming dengan atribut masing-masing. Program dapat menampilkan informasi perangkat, menghitung pajak, dan menghitung harga promo laptop.
- **Soal 2 (Analisis Konsep):** Menunjukkan proses inheritance, overriding, upcasting, downcasting, urutan pemanggilan constructor, serta perhitungan luas lingkaran dan titik.
- **Soal 3 (Titik dan Garis):** Membuat objek titik dan garis, menghitung panjang garis, serta menerapkan defensive copy agar perubahan objek dari luar tidak memengaruhi data garis.
- **Soal 4 (Toko Digital):** Mengelola produk fisik, digital, dan langganan menggunakan ArrayList. Program dapat menghitung harga akhir, mencetak struk, menghitung jumlah produk berdasarkan jenis, serta menolak kode produk yang sama.

## Konsep OOP yang Diterapkan

| Nama Konsep | Lokasi Penerapan | Alasan Pemilihan |
|---|---|---|
| Inheritance | Laptop, Ponsel, LaptopGaming mewarisi Perangkat; ProdukFisik, ProdukDigital, dan Langganan mewarisi Produk. | Menggunakan kembali atribut dan method dari superclass. |
| Encapsulation | Atribut pada kelas Perangkat dan Produk. | Mengatur akses terhadap data agar tidak dapat diubah sembarangan. |
| Protected | Atribut harga pada Perangkat. | Memungkinkan subclass mengakses atribut superclass secara langsung. |
| Multilevel Inheritance | LaptopGaming mewarisi Laptop yang mewarisi Perangkat. | Menunjukkan pewarisan bertingkat. |
| Method Overriding | infoSingkat(), suara(), hitungHargaAkhir(), dan deskripsi(). | Memberikan implementasi method yang berbeda pada subclass. |
| Polimorfisme | Keranjang.cetakStruk() dan hitungTotal(). | Memungkinkan pemanggilan method yang sama dengan perilaku sesuai objek sebenarnya. |
| Upcasting dan Downcasting | TesSoal2 dan Keranjang.hitungPerJenis(). | Mengubah referensi objek antara superclass dan subclass. |
| instanceof | TesSoal2 dan Keranjang.hitungPerJenis(). | Memeriksa tipe objek sebelum melakukan downcasting. |
| Composition | Garis memiliki dua objek Titik dan Keranjang memiliki daftar Produk. | Menunjukkan hubungan has-a antarobjek. |
| Overloading | Constructor pada kelas Titik dan Garis. | Menyediakan beberapa cara untuk membuat objek. |
| Defensive Copy | Constructor, setter, dan getter pada Garis. | Menjaga agar perubahan objek dari luar tidak memengaruhi data internal. |
| Exception Handling | Validasi pada Perangkat, Produk, dan Keranjang. | Menangani input yang tidak sesuai dan kode produk duplikat. |

## Struktur Project

```text
Tugas2_Inherit-polymorph-2545/
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Ponsel.java
│   │   ├── LaptopGaming.java
│   │   └── TesSoal1.java
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Lingkaran.java
│   │   ├── Titik.java
│   │   └── TesSoal2.java
│   ├── soal3/
│   │   ├── Titik.java
│   │   ├── Garis.java
│   │   └── TesSoal3.java
│   └── soal4/
│       ├── Produk.java
│       ├── ProdukFisik.java
│       ├── ProdukDigital.java
│       ├── Langganan.java
│       ├── Keranjang.java
│       └── TesSoal4.java
├── ss/
├── .gitignore
└── README.md
```

## Prasyarat dan Cara Menjalankan Program

**Prasyarat:**
- Java Development Kit (JDK).
- Terminal atau Command Prompt.
- Visual Studio Code atau IDE Java lainnya.

**Cara menjalankan program:**

Buka terminal pada folder utama project, kemudian jalankan perintah berikut sesuai soal.

**Soal 1**
```powershell
javac -d out src\soal1\*.java
java -cp out soal1.TesSoal1
```

**Soal 2**
```powershell
javac -d out src\soal2\*.java
java -cp out soal2.TesSoal2
```

**Soal 3**
```powershell
javac -d out src\soal3\*.java
java -cp out soal3.TesSoal3
```

**Soal 4**
```powershell
javac -d out src\soal4\*.java
java -cp out soal4.TesSoal4
```

## Contoh Output

### Soal 1 – Perangkat Elektronik

```text
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000
```

### Soal 2 – Analisis Konsep

**Bagian A: Hewan dan Kucing**

```text
=== BAGIAN A ===
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
h2 bukan objek Kucing
```

**Bagian B: Urutan Constructor**

```text
=== BAGIAN B ===
A dibuat
init B, nilai=0
B dibuat, nilai=5
```

**Bagian C: Lingkaran dan Titik**

```text
=== BAGIAN C ===
78.53981633974483
0.0
0.0
```

### Soal 3 – Titik dan Garis

```text
(0.0, 0.0) - (3.0, 4.0) panjang=5.0
(1.0, 1.0) - (5.0, 5.0)
```

### Soal 4 – Toko Digital

Baris terakhir menunjukkan penanganan exception ketika kode produk yang sama dimasukkan kembali ke dalam keranjang.

```text
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Kode produk F01 sudah ada.
```

## Jawaban Soal dan Analisis Konsep

### Soal 1 – Pertanyaan Tambahan

**Pertanyaan:** Ubah atribut harga menjadi private, kemudian kompilasi program. Apa pesan error yang muncul dan mengapa?

**Pesan error:**

```text
src\soal1\Laptop.java:39: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / 100);
               ^
src\soal1\Laptop.java:39: error: harga has private access in Perangkat
        return harga - (harga * diskonPersen / 100);
                        ^
2 errors
```

**Penjelasan:**

Error tersebut muncul karena atribut dengan access modifier private hanya dapat diakses secara langsung dari dalam kelas tempat atribut tersebut dideklarasikan. Walaupun Laptop merupakan subclass dari Perangkat, atribut harga yang bersifat private tidak dapat diakses langsung oleh Laptop. Hal ini menyebabkan method hitungHargaPromo() tidak dapat menggunakan atribut harga. Setelah access modifier dikembalikan menjadi protected, subclass dapat mengakses atribut tersebut secara langsung dan program berhasil dikompilasi.

### Soal 2 – Analisis Output, Error, dan Polimorfisme

**Bagian A: Hewan dan Kucing**

**1. Tuliskan output lengkap program sampai program berhenti.**

Pada kode awal sebelum downcasting diperbaiki, program menghasilkan output berikut:

```text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Exception in thread "main" java.lang.ClassCastException:
class soal2.Hewan cannot be cast to class soal2.Kucing ...
```

Program berhenti ketika menjalankan baris `Kucing k2 = (Kucing) h2;`. Hal ini terjadi karena h2 merupakan objek Hewan biasa, bukan objek Kucing. Pesan ClassCastException disertai stack trace ketika program dijalankan.

**2. Jika komentar pada baris h.panjat() dihapus, error apa yang muncul?**

Error yang muncul adalah `cannot find symbol` pada tahap kompilasi, bukan saat program berjalan. Hal ini karena variabel h memiliki tipe statis Hewan, sedangkan method panjat() hanya tersedia pada kelas Kucing. Walaupun objek yang disimpan sebenarnya adalah Kucing, compiler tetap memeriksa method berdasarkan tipe variabelnya. Oleh karena itu, method panjat() tidak dapat dipanggil secara langsung melalui variabel h.

**3. Baris mana yang menyebabkan ClassCastException? Bagaimana cara memperbaikinya menggunakan instanceof?**

Baris yang menyebabkan ClassCastException adalah:

```java
Kucing k2 = (Kucing) h2;
```

Kesalahan terjadi karena objek h2 dibuat menggunakan `new Hewan("Generik")`, sehingga bukan merupakan objek Kucing. Perbaikannya dapat dilakukan menggunakan instanceof tanpa mengubah tipe variabel h2:

```java
if (h2 instanceof Kucing) {
    Kucing k2 = (Kucing) h2;
    k2.panjat();
} else {
    System.out.println("h2 bukan objek Kucing");
}
```

Dengan pemeriksaan tersebut, downcasting hanya dilakukan jika objek memang merupakan Kucing. Jika bukan, program menjalankan bagian else sehingga tidak terjadi ClassCastException.

**4. Pada h.makan(), method suara() milik kelas mana yang dijalankan? Jelaskan tipe statis dan tipe dinamis.**

Method suara() yang dijalankan adalah milik kelas Kucing sehingga menghasilkan output `meong`. Tipe statis dari variabel h adalah Hewan, sedangkan tipe dinamisnya adalah Kucing karena objek yang dibuat menggunakan `new Kucing("Tom")`. Tipe statis menentukan method yang dapat dipanggil melalui variabel, sedangkan tipe dinamis menentukan implementasi method overriding yang dijalankan ketika program berjalan. Karena objek sebenarnya adalah Kucing, Java menjalankan method suara() versi Kucing.

**Bagian B: Urutan Constructor**

**5. Tuliskan prediksi output new B(), lalu jelaskan mengapa nilai pada init B bukan 5 dan apa risikonya.**

Prediksi output:

```text
A dibuat
init B, nilai=0
B dibuat, nilai=5
```

Nilai pada bagian init B adalah 0 karena constructor superclass A dijalankan terlebih dahulu sebelum inisialisasi atribut nilai milik B selesai. Ketika constructor A memanggil method init(), Java menjalankan versi yang dioverride oleh B, tetapi atribut nilai masih menggunakan nilai awal bawaan yaitu 0. Setelah constructor A selesai, barulah atribut nilai diinisialisasi menjadi 5. Risiko memanggil method yang dapat dioverride dari dalam constructor adalah method subclass bisa dijalankan ketika atribut subclass belum siap, sehingga dapat menghasilkan nilai yang tidak sesuai atau kesalahan program.

**Bagian C: Lingkaran dan Titik**

**6. Mengapa l3.luas() menghasilkan 0.0 padahal tipe variabelnya Lingkaran? Apakah hubungan Titik adalah Lingkaran masuk akal? Apa konsekuensinya?**

Hasil l3.luas() adalah 0.0 karena objek sebenarnya merupakan Titik yang meng-override method luas() dengan nilai 0.0. Walaupun tipe variabelnya Lingkaran, Java tetap menjalankan method berdasarkan tipe objek sebenarnya. Hubungan Titik adalah Lingkaran kurang tepat karena titik bukan merupakan jenis lingkaran, sehingga relasi inheritance tersebut tidak sesuai dengan konsep is-a. Akibatnya, objek Titik dapat digunakan sebagai Lingkaran meskipun tidak memenuhi perilaku yang diharapkan dari sebuah lingkaran. Jika suatu method mengharapkan luas lingkaran selalu lebih dari nol, penggunaan objek Titik dapat menyebabkan hasil perhitungan yang tidak sesuai atau kesalahan program.

### Soal 3 – Titik dan Garis

**1. Apa yang tercetak pada baris kedua dan mengapa?**

Sebelum menggunakan defensive copy, output baris kedua adalah:

```text
(100.0, 1.0) - (5.0, 5.0)
```

Hal ini terjadi karena objek Garis menyimpan referensi ke objek Titik yang sama dengan variabel t. Ketika t.setX(100) dijalankan, nilai x pada objek tersebut ikut berubah. Karena objek yang digunakan masih sama, titik awal pada garis juga berubah. Peristiwa ini disebut aliasing.

**2. Ubah constructor Garis agar perubahan objek luar tidak memengaruhi isi Garis. Setelah diperbaiki, apa yang tercetak?**

Constructor Garis dapat menggunakan defensive copy dengan membuat objek Titik baru berdasarkan koordinat objek yang diterima:

```java
this.awal = new Titik(awal.getX(), awal.getY());
this.akhir = new Titik(akhir.getX(), akhir.getY());
```

Setelah diperbaiki, output baris kedua adalah:

```text
(1.0, 1.0) - (5.0, 5.0)
```

Hal ini karena Garis sudah menyimpan salinan objek Titik sendiri. Perubahan pada variabel t tidak lagi memengaruhi titik yang tersimpan di dalam objek Garis.

**3. Kapan perilaku sebelum perbaikan lebih tepat dan kapan sesudah perbaikan lebih tepat?**

Perilaku sebelum perbaikan lebih tepat jika beberapa objek memang perlu berbagi referensi ke titik yang sama. Contohnya, beberapa garis yang terhubung dapat menggunakan satu titik bersama sehingga ketika titik tersebut berubah, semua garis ikut menyesuaikan. Sementara itu, defensive copy lebih tepat jika objek Garis harus memiliki data titik sendiri dan tidak boleh berubah akibat perubahan objek dari luar. Pemilihannya bergantung pada kebutuhan program dan hubungan antarobjek yang ingin dibuat.

**4. Jika Garis dibuat dengan extends Titik, masalah desain apa yang muncul berdasarkan relasi is-a dan has-a?**

Jika Garis dibuat dengan extends Titik, hubungan tersebut tidak sesuai karena garis bukan merupakan sebuah titik. Garis justru tersusun dari dua titik, yaitu titik awal dan titik akhir, sehingga lebih tepat menggunakan composition atau relasi has-a. Jika menggunakan inheritance, Garis akan mewarisi atribut dan method milik Titik yang sebenarnya tidak sesuai dengan sifat sebuah garis. Oleh karena itu, penggunaan composition membuat struktur program lebih sesuai dengan hubungan objek yang sebenarnya.

### Analisis Konsep

**1. Apa perbedaan method overriding dan method overloading? Berikan contohnya dan jelaskan kaitannya dengan inheritance dan polimorfisme.**

Overriding adalah ketika subclass menulis ulang method yang berasal dari superclass dengan nama dan parameter yang sama. Contohnya adalah method infoSingkat() pada kelas Laptop yang meng-override method infoSingkat() dari kelas Perangkat. Sementara itu, overloading adalah penggunaan nama method atau constructor yang sama dengan parameter berbeda, seperti dua constructor pada kelas Garis, yaitu Garis(Titik, Titik) dan Garis(double, double, double, double). Overriding berkaitan dengan inheritance dan polimorfisme karena implementasi method dapat berbeda sesuai objek sebenarnya, sedangkan overloading memberikan beberapa cara untuk menggunakan method atau constructor berdasarkan parameter yang diberikan.

**2. Kapan memilih inheritance dan kapan memilih composition? Berikan contoh dari tugas ini.**

Inheritance digunakan ketika terdapat hubungan is-a atau ketika suatu kelas merupakan jenis dari kelas lainnya. Contohnya, Laptop merupakan jenis Perangkat sehingga dapat mewarisi atribut dan method dari kelas Perangkat. Composition digunakan ketika suatu objek memiliki atau tersusun dari objek lain. Contohnya, Garis memiliki dua objek Titik sebagai titik awal dan titik akhir. Pemilihan konsep tersebut harus disesuaikan dengan hubungan sebenarnya agar struktur program lebih mudah dipahami dan tidak menggunakan pewarisan yang tidak sesuai.

**3. Pada Soal 4, mengapa cetakStruk() tidak memerlukan instanceof sedangkan hitungPerJenis() memerlukannya? Mengapa downcasting tidak selalu aman?**

Method cetakStruk() tidak memerlukan instanceof karena cukup memanggil method deskripsi() dan hitungHargaAkhir() yang sudah dioverride oleh masing-masing subclass Produk. Java akan menjalankan implementasi method sesuai objek sebenarnya melalui polimorfisme. Sementara itu, hitungPerJenis() membutuhkan instanceof karena harus mengetahui jenis produk untuk menghitung jumlah produk fisik, digital, dan langganan. Pengecekan Langganan harus dilakukan terlebih dahulu karena Langganan merupakan subclass dari ProdukDigital. Downcasting tidak selalu aman karena dapat menyebabkan ClassCastException apabila tipe objek sebenarnya tidak sesuai dengan tipe subclass yang dituju.

## Batasan dan Pengembangan Lanjutan

**Batasan Saat Ini:**
- Program masih dijalankan melalui terminal dan belum menggunakan tampilan antarmuka grafis.
- Data hanya digunakan selama program berjalan dan belum disimpan ke database.
- Pengujian menggunakan data yang ditulis langsung pada kelas Tes.
- Tantangan opsional ProdukBundel belum dikerjakan.

**Pengembangan Lanjutan:**
- Menambahkan tampilan GUI agar program lebih mudah digunakan.
- Menambahkan penyimpanan data menggunakan database.
- Menambahkan input interaktif menggunakan Scanner.
- Mengembangkan fitur ProdukBundel dengan beberapa produk dan diskon khusus.