package Kuis2;

public class Pembeli_18 {
    String namaPembeli;
    String NoHp;

    Pembeli_18 prev,next;

    Pembeli_18(Pembeli_18 prev, String b, String c, Pembeli_18 next){
        this.prev = prev;
        this.namaPembeli = b;
        this.NoHp = c;
        this.next = next;
    }
}
