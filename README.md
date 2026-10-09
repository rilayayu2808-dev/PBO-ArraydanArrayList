# PBO-ArraydanArrayList
# 🏦 Simple Banking System

**Simulasi sistem perbankan sederhana berbasis Java & Object-Oriented Programming**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Paradigm](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![App](https://img.shields.io/badge/App-Console-lightgrey?style=for-the-badge\&logo=gnometerminal\&logoColor=black)

*Kelola data nasabah, lakukan deposit dan penarikan saldo, serta lihat ringkasan transaksi menggunakan program Java yang sederhana dan terstruktur.* 💸

---

## 📖 Tentang Proyek

**Simple Banking System** adalah program simulasi perbankan sederhana yang dibuat menggunakan bahasa pemrograman Java untuk menerapkan konsep **Object-Oriented Programming (OOP)**.

Program ini mengelola data nasabah, akun bank, serta transaksi berupa deposit dan penarikan saldo (*withdraw*). Sistem menggunakan beberapa class yang saling berhubungan, yaitu `Bank`, `Customer`, dan `Account`, dengan `Main` sebagai tempat menjalankan simulasi.

Dalam program ini, bank dapat menyimpan maksimal 10 nasabah. Setiap nasabah dapat memiliki lebih dari satu akun, dan setiap akun mempunyai saldo masing-masing.

## ✨ Fitur

* 👥 **Manajemen Nasabah** — menambahkan dan mengambil data nasabah berdasarkan indeks.
* 💳 **Manajemen Akun** — setiap nasabah dapat memiliki beberapa akun menggunakan `ArrayList`.
* 💰 **Deposit** — menambahkan saldo jika nominal yang dimasukkan lebih dari nol.
* 🏧 **Withdraw** — menarik saldo dengan pengecekan kecukupan dana.
* 📊 **Riwayat Transaksi** — menampilkan transaksi deposit dan penarikan yang berhasil.
* 💵 **Ringkasan Saldo Akhir** — menampilkan saldo akhir masing-masing nasabah.
* 🛡️ **Validasi Data** — memeriksa kapasitas bank, indeks nasabah, indeks akun, dan nominal deposit.
* 🔒 **Encapsulation** — atribut dibuat `private` agar akses data dilakukan melalui method yang disediakan.

## 📸 Hasil Output

Program menampilkan daftar nasabah, saldo awal, riwayat transaksi, saldo akhir, dan jumlah nasabah yang terdaftar.

Untuk menambahkan gambar hasil program, simpan tangkapan layar terminal dengan nama `hasil.png`, kemudian unggah ke repository GitHub yang sama.

Setelah gambar berhasil diunggah, gunakan Markdown berikut:

```markdown
![Uploading Screenshot (79).png…]()

```

## 🧩 Struktur Class

```text
📦 Simple-Banking-System
 ┣ 📜 Account.java    → Mengelola saldo dan transaksi
 ┣ 📜 Customer.java   → Menyimpan data nasabah dan daftar akun
 ┣ 📜 Bank.java       → Mengelola daftar nasabah
 ┣ 📜 Main.java       → Menjalankan simulasi program
 ┗ 📜 README.md       → Dokumentasi proyek
```

### 🔗 Relasi Antar Class

```text
Bank
 │
 └── Customer[]
       │
       └── Customer
             │
             └── ArrayList<Account>
                       │
                       └── Account
                            └── Balance
```

* `Bank` menyimpan kumpulan objek `Customer` menggunakan array.
* `Customer` menyimpan identitas nasabah dan daftar akun menggunakan `ArrayList<Account>`.
* `Account` mengelola saldo serta transaksi deposit dan withdraw.
* `Main` membuat objek, menjalankan transaksi, dan menampilkan hasil simulasi.

### 📋 Tanggung Jawab Setiap Class

| Class      | Tanggung Jawab                       | Method Utama                                                                            |
| ---------- | ------------------------------------ | --------------------------------------------------------------------------------------- |
| `Account`  | Mengelola saldo akun                 | `getBalance()`, `deposit()`, `withdraw()`                                               |
| `Customer` | Menyimpan identitas dan akun nasabah | `getFirstName()`, `getLastName()`, `setAccount()`, `getAccount()`, `getNumOfAccounts()` |
| `Bank`     | Mengelola daftar nasabah             | `addCustomer()`, `getCustomer()`, `getNumOfCustomers()`                                 |
| `Main`     | Menjalankan simulasi perbankan       | `main()`                                                                                |

## 🚀 Cara Menjalankan Program

### ☕ Prasyarat

Pastikan komputer sudah memiliki **Java Development Kit (JDK)** yang terpasang.

Periksa instalasi Java melalui terminal atau Command Prompt:

```bash
java -version
javac -version
```

### Langkah-langkah

**1. Clone repository**

Ganti `<username>` dan `<nama-repo>` sesuai akun serta nama repository GitHub kamu.

```bash
git clone https://github.com/<username>/<nama-repo>.git
cd <nama-repo>
```

**2. Compile semua file Java**

```bash
javac *.java
```

**3. Jalankan program**

```bash
java Main
```

Pastikan seluruh file Java berada dalam direktori yang sama dan tidak menggunakan deklarasi `package` yang memerlukan struktur direktori khusus.

## 🖥️ Contoh Output

Berikut gambaran output berdasarkan kode `Main.java` yang digunakan:

```text
==========================================================
                 SYSTEM OPERASIONAL BANK
==========================================================
 1. DAFTAR NASABAH DAN SALDO AWAL
    Nasabah 1 : Ayu        | Akun 1 : Rp 100000
    Nasabah 2 : Radit      | Akun 1 : Rp 250000
----------------------------------------------------------
 2. RIWAYAT TRANSAKSI
    Transaksi Ayu
      BERHASIL DEPOSIT  Rp 500000   | Nasabah: Ayu
      BERHASIL WITHDRAW Rp 150000   | Nasabah: Ayu

    Transaksi Radit
      BERHASIL DEPOSIT  Rp 50000    | Nasabah: Radit
      BERHASIL WITHDRAW Rp 100000   | Nasabah: Radit
----------------------------------------------------------
 3. RINGKASAN SALDO AKHIR
    Saldo Akhir Ayu        : Rp 450000
    Saldo Akhir Radit      : Rp 200000
----------------------------------------------------------
 Total Nasabah Terdaftar  : 2 nasabah
==========================================================
```

*Catatan: contoh output di atas menggambarkan hasil yang diharapkan dari kode saat ini.*

## 🔍 Alur Simulasi di `Main.java`

1. Membuat objek `Bank` untuk mengelola data nasabah.
2. Menambahkan dua nasabah, yaitu **Ayu** dan **Radit**.
3. Mengambil data kedua nasabah berdasarkan indeks.
4. Membuat akun Ayu dengan saldo awal **Rp100.000** dan akun Radit dengan saldo awal **Rp250.000**.
5. Menampilkan daftar nasabah beserta saldo awal masing-masing.
6. Melakukan deposit **Rp500.000** dan withdraw **Rp150.000** pada akun Ayu.
7. Melakukan deposit **Rp50.000** dan withdraw **Rp100.000** pada akun Radit.
8. Menampilkan saldo akhir setiap nasabah dan jumlah nasabah yang terdaftar.

### 💰 Perhitungan Saldo

| Nasabah | Saldo Awal |   Deposit |  Withdraw | Saldo Akhir |
| ------- | ---------: | --------: | --------: | ----------: |
| Ayu     |  Rp100.000 | Rp500.000 | Rp150.000 |   Rp450.000 |
| Radit   |  Rp250.000 |  Rp50.000 | Rp100.000 |   Rp200.000 |

Semua transaksi pada simulasi tersebut berhasil karena nominal deposit positif dan saldo awal mencukupi untuk penarikan.

## 🗃️ Implementasi Array dan ArrayList

Proyek ini menggunakan dua struktur data untuk menyimpan objek, yaitu **Array** dan **ArrayList**.

### 1️⃣ Array — `Customer[]` pada class `Bank`

Array digunakan untuk menyimpan daftar nasabah dengan kapasitas tetap sebanyak 10 nasabah.

```java
private final Customer[] customers;
private int numberOfCustomers;

public Bank() {
    customers = new Customer[10];
    numberOfCustomers = 0;
}
```

Keterangan:

* `Customer[] customers` menyimpan objek nasabah.
* `numberOfCustomers` mencatat jumlah nasabah yang sudah ditambahkan.
* `new Customer[10]` menetapkan kapasitas maksimal 10 nasabah.
* `numberOfCustomers++` menambah jumlah nasabah setelah data berhasil disimpan.

Sebelum menambahkan nasabah, program memeriksa kapasitas array agar tidak terjadi kesalahan saat bank sudah penuh.

### 2️⃣ ArrayList — `ArrayList<Account>` pada class `Customer`

ArrayList digunakan untuk menyimpan daftar akun milik setiap nasabah. Berbeda dengan array biasa, ukuran ArrayList dapat bertambah ketika akun baru ditambahkan.

```java
import java.util.ArrayList;

private final ArrayList<Account> accounts;

public Customer(String f, String l) {
    this.firstName = f;
    this.lastName = l;
    this.accounts = new ArrayList<>();
}
```

Penambahan dan pengambilan akun dilakukan menggunakan method bawaan:

```java
public void setAccount(Account acct) {
    accounts.add(acct);
}

public Account getAccount(int account_index) {
    if (account_index >= 0 && account_index < accounts.size()) {
        return accounts.get(account_index);
    }
    return null;
}

public int getNumOfAccounts() {
    return accounts.size();
}
```

Keterangan:

* `accounts.add(acct)` menambahkan akun baru.
* `accounts.get(index)` mengambil akun berdasarkan indeks.
* `accounts.size()` mengembalikan jumlah akun.
* Pemeriksaan indeks mencegah pengambilan akun pada posisi yang tidak tersedia.

### ⚖️ Perbandingan Array dan ArrayList

| Aspek             | Array (`Customer[]`)                     | ArrayList (`ArrayList<Account>`) |
| ----------------- | ---------------------------------------- | -------------------------------- |
| Ukuran            | Tetap, maksimal 10 nasabah               | Dinamis                          |
| Menambahkan data  | Menggunakan indeks                       | Menggunakan `add()`              |
| Mengambil data    | Menggunakan `customers[index]`           | Menggunakan `get(index)`         |
| Menghitung jumlah | Menggunakan variabel `numberOfCustomers` | Menggunakan `size()`             |
| Penggunaan        | Daftar nasabah pada `Bank`               | Daftar akun pada `Customer`      |

**Kesimpulan:** Array cocok untuk menyimpan data dengan kapasitas yang telah ditentukan, sedangkan ArrayList cocok untuk kumpulan data yang jumlah elemennya dapat bertambah.

## 💡 Konsep OOP yang Diterapkan

| Konsep             | Penerapan dalam Program                                                                 |
| ------------------ | --------------------------------------------------------------------------------------- |
| **Class & Object** | `Bank`, `Customer`, dan `Account` digunakan untuk membentuk objek dalam simulasi.       |
| **Encapsulation**  | Atribut seperti `balance`, `firstName`, `lastName`, dan `accounts` dibuat `private`.    |
| **Constructor**    | Menginisialisasi saldo akun, identitas nasabah, daftar akun, dan kapasitas bank.        |
| **Composition**    | Bank mengelola nasabah, sedangkan nasabah memiliki daftar akun.                         |
| **Method**         | Operasi dilakukan melalui method seperti `deposit()`, `withdraw()`, dan `getBalance()`. |
| **Array**          | Menyimpan daftar nasabah dengan kapasitas maksimal 10.                                  |
| **ArrayList**      | Menyimpan daftar akun nasabah secara dinamis.                                           |
| **Validasi**       | Memeriksa nominal deposit, kapasitas bank, dan indeks saat mengambil data.              |

## 🛡️ Validasi dan Batasan Program

Program sudah memiliki beberapa pemeriksaan dasar:

* Deposit hanya berhasil jika nominal lebih besar dari nol.
* Penambahan nasabah dihentikan ketika kapasitas bank mencapai 10 nasabah.
* Pengambilan nasabah atau akun menghasilkan `null` jika indeks tidak valid.

**Catatan pengembangan:** Method `withdraw()` saat ini belum memeriksa apakah nominal penarikan lebih besar dari nol. Karena itu, validasi nominal penarikan perlu ditambahkan agar transaksi tidak menerima angka negatif.

Program juga belum menggunakan input interaktif dari pengguna karena data nasabah dan transaksi masih ditentukan langsung di dalam `Main.java`.

## 🛣️ Rencana Pengembangan

* 📝 Menambahkan validasi nominal withdraw agar harus lebih besar dari nol.
* ⌨️ Menambahkan menu interaktif menggunakan `Scanner`.
* 🔄 Membuat fitur transfer saldo antar akun.
* 📜 Menyimpan riwayat transaksi secara lebih lengkap.
* 💾 Menambahkan penyimpanan data ke file atau database.
* 🔐 Meningkatkan validasi agar sistem lebih aman dan andal.

## 👨‍💻 Identitas Pembuat

| Keterangan   | Informasi        |
| ------------ | ---------------- |
| 👤 **Nama**  | [Rila Yayu Wahyuningsih]  |
| 🆔 **NIM**   | [F1D02510024]   |
| 🏫 **Kelas** | [3B] |

Dibuat dengan ☕ Java dan semangat belajar Object-Oriented Programming.

---

⭐ Terima kasih sudah melihat proyek **Simple Banking System** ini! ⭐
