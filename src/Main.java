import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int choice;
        int quantity;
        struk();
        Greeting(); //variabel untuk menampilkan Greeting app yang sudah dibuat
        lihatMenuMakanan(); //variabel untuk menampilkan menu makanan yang sudah dibuat
        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Program");
        System.out.println("");
        System.out.print("Pilihan Anda: ");
        choice = scanner.nextInt(); //untuk memasukan hasil input ke variabel "choice"

        String[] nama = //mengisi array "nama"
                {
                        "Nasi Goreng    | Rp 15.000",
                        "Mie Goreng     | Rp 13.000",
                        "Nasi + Ayam    | Rp 18.000",
                        "Es Teh Manis   | Rp 3.000",
                        "Es Jeruk       | Rp 5.000"
                };
        int[] harga = //mengisi array "harga"
                {
                        15000,
                        13000,
                        18000,
                        3000,
                        5000
                };

        do {
            switch (choice) { //membaca hasil input pada variabel "choice" lalu mengeksekusi setiap case yang sudah disediakan
                case 1:
                    pesanan();
                    System.out.println(nama[0]);
                    System.out.println("(Input 0 untuk kembali)");
                    System.out.println("");
                    System.out.print("Masukan Qty : ");
                    quantity = input.nextInt();
                    break;

                case 2:
                    pesanan();
                    System.out.println(nama[1]);
                    System.out.println("(Input 0 untuk kembali)");
                    System.out.println("");
                    System.out.print("Masukan Qty : ");
                    quantity = input.nextInt();
                    break;
                case 3:
                    pesanan();
                    System.out.println(nama[2]);
                    System.out.println("(Input 0 untuk kembali)");
                    System.out.println("");
                    System.out.print("Masukan Qty : ");
                    quantity = input.nextInt();
                    break;
                case 4:
                    pesanan();
                    System.out.println(nama[3]);
                    System.out.println("(Input 0 untuk kembali)");
                    System.out.println("");
                    System.out.print("Masukan Qty : ");
                    quantity = input.nextInt();
                    break;
                case 5:
                    pesanan();
                    System.out.println(nama[4]);
                    System.out.println("(Input 0 untuk kembali)");
                    System.out.println("");
                    System.out.print("Masukan Qty : ");
                    quantity = input.nextInt();
//                    break;
                case 99://true jika user memilih kode 99 untuk memesan menu
//                    hitungPesanan();
                    break;
                case 0://true jika user memilih kode 0 (Keluar aplikasi)
                    System.out.println("Terima kasih telah menggunakan aplikasi kami!");
                    break;
                default://True jika user menginputkan kode diluar case (INVALID)
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 0);//jika user menginputkan kode 0
        scanner.close();//maka akan menutup program
    }

    public static void Greeting() {
        System.out.println("==============================================");
        System.out.println("|         SELAMAT DATANG di RAFOOD's         |");
        System.out.println("|    Aplikasi sederhana Pemesanan Makanan    |");
        System.out.println("|            Raffael Deni Mulyadi            |");
        System.out.println("==============================================");
    }

    public static void pesanan() {
        System.out.println("=========================");
        System.out.println("|  Berapa Pesanan Anda  |");
        System.out.println("=========================");
        System.out.println("");
    }

    public static void konfirmasi() {
        System.out.println("=============================");
        System.out.println("|  Konfirmasi & Pembayaran  |");
        System.out.println("=============================");
    }

    public static void lihatMenuMakanan() {
        System.out.println("Silahkan Pilih Makanan :");
        System.out.println("1. Nasi Goreng  | Rp 15.000");
        System.out.println("2. Mie Goreng   | Rp 13.000");
        System.out.println("3. Nasi + Ayam  | Rp 18.000");
        System.out.println("4. Es Teh Manis | Rp 3.000");
        System.out.println("5. Es Jeruk     | Rp 5.000");
    }

    public static void konfPembayaran() {
        konfirmasi(); //untuk menampilkan isi dari variabel "Konfiramsi"

        System.out.println("------------------------------------- +");
        System.out.println("Total"); //Operasi Hitung total
        System.out.println("");
        System.out.println("1. Konfirmasi dan Bayar");
        System.out.println("2. Kembali ke menu utama");
        System.out.println("0. Keluar aplikasi");
        System.out.println("");
        System.out.println("Masukan pilihan anda = ");
    }

    public static void struk() {
        System.out.println("=============================");
        System.out.println("          RAFOOD's           ");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Terima kasih sudah memesan");
        System.out.println("di RAFFOOD's");
        System.out.println("");
        System.out.println("Dibawah ini adalah pesanan anda");
        System.out.println("");

        //OPERASI HITUNG PESANAN

        System.out.println("Pembayaran : RAFFOOD's");
        System.out.println("");
        System.out.println("=============================");
        System.out.println("Simpan struk ini sebagai");
        System.out.println("bukti pembayaran");
        System.out.println("=============================");
        System.out.println("");

    }

}