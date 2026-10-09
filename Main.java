public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 1. Menambahkan data nasabah (Ayu dan Radit)
        bank.addCustomer("Ayu", "");
        bank.addCustomer("Radit", "");

        Customer c1 = bank.getCustomer(0); // Nasabah 1 (Ayu)
        Customer c2 = bank.getCustomer(1); // Nasabah 2 (Radit)

        // 2. Menambahkan akun ke masing-masing nasabah
        c1.setAccount(new Account(100000)); // Saldo awal Ayu
        c2.setAccount(new Account(250000)); // Saldo awal Radit

        // 3. Tampilan Informasi Awal
        System.out.println("==========================================================");
        System.out.println("                 SYSTEM OPERASIONAL BANK                  ");
        System.out.println("==========================================================");

        System.out.println(" 1. DAFTAR NASABAH DAN SALDO AWAL");
        System.out.println("    Nasabah 1 : " + c1.getFirstName() + "        | Akun 1 : Rp " + (int) c1.getAccount(0).getBalance());
        System.out.println("    Nasabah 2 : " + c2.getFirstName() + "      | Akun 1 : Rp " + (int) c2.getAccount(0).getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println(" 2. RIWAYAT TRANSAKSI");

        // Transaksi Ayu
        Account accAyu = c1.getAccount(0);
        System.out.println("    Transaksi " + c1.getFirstName());
        if (accAyu.deposit(500000)) {
            System.out.println("      BERHASIL DEPOSIT  Rp 500000   | Nasabah: " + c1.getFirstName());
        }
        if (accAyu.withdraw(150000)) {
            System.out.println("      BERHASIL WITHDRAW Rp 150000   | Nasabah: " + c1.getFirstName());
        }

        System.out.println();

        // Transaksi Radit
        Account accRadit = c2.getAccount(0);
        System.out.println("    Transaksi " + c2.getFirstName());
        if (accRadit.deposit(50000)) {
            System.out.println("      BERHASIL DEPOSIT  Rp 50000    | Nasabah: " + c2.getFirstName());
        }
        if (accRadit.withdraw(100000)) {
            System.out.println("      BERHASIL WITHDRAW Rp 100000   | Nasabah: " + c2.getFirstName());
        }

        // 4. Ringkasan Saldo Akhir
        System.out.println("----------------------------------------------------------");
        System.out.println(" 3. RINGKASAN SALDO AKHIR");
        System.out.println("    Saldo Akhir " + c1.getFirstName() + "        : Rp " + (int) accAyu.getBalance());
        System.out.println("    Saldo Akhir " + c2.getFirstName() + "      : Rp " + (int) accRadit.getBalance());

        System.out.println("----------------------------------------------------------");
        System.out.println(" Total Nasabah Terdaftar  : " + bank.getNumOfCustomers() + " nasabah");
        System.out.println("==========================================================");
    }
}