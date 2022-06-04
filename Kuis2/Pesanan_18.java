package Kuis2;

public class Pesanan_18 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    Pesanan_18 prev, next;

    Pesanan_18(Pesanan_18 prev, int a, String b, int c, Pesanan_18 next){
        this.prev = prev;
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = c;
        this.next = next;
    }
}
