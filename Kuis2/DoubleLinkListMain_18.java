package Kuis2;
import java.util.Scanner;

public class DoubleLinkListMain_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        DoubleLinkList_18 dll = new DoubleLinkList_18();

        int pilih;
        do{
            System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI - 1G dan TI - 1F ========");
            System.out.println("Dibuat oleh : Maulidio Farhan Rizkullah");
            System.out.println("NIM : 2141720041");
            System.out.println("Absen : 18");
            System.out.println("===========================================================");
            System.out.println("Menu");
            System.out.println(" 1. Tambah Antrian\n 2. Cetak Antrian\n 3. Hapus Antrian\n 4. Laporan Pengurutan pesanan by nama\n 5. Hitung total Pendapatan\n 6. Keluar\n Pilih (1-5): 1");
            System.out.println("-----------------------------------");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.println("Masukkan Data Pembeli");
                    System.out.print("Nama Pembeli\t\t: ");
                    String np = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Nomor HP\t: ");
                    String nh = sc.nextLine();
                    dll.addLast(np, nh);
                    sc.nextLine();
                    break;

                case 2:
                    dll.print();
                    break;


                case 3:
                    dll.removeFirst();
                    System.out.println("Transaksi Input Pesanan");
                    System.out.println("Kode Pesanan: ");
                    int kdP = sc.nextInt();
                    System.out.println("Nama Pesanan: ");
                    String nP = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Harga Pesanan: ");
                    int hrg = sc.nextInt();

                    dll.addFirst1(kdP, nP, hrg);
                    break;

            }
        }while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}

