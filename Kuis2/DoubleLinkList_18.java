package Kuis2;

public class DoubleLinkList_18 {
    Pembeli_18 head1;
    Pesanan_18 head2;
    int size;

    public DoubleLinkList_18(){
        head1 = null;
        head2 = null;
        size = 0;

    }

    public boolean isEmpty(){
        return head1 == null;
    }

    public boolean isEmpty1(){
        return head2 == null;
    }
    public void addFirst(String b, String c){
        if (isEmpty()){
            head1  = new Pembeli_18(null, b, c, null);
        }else{
            Pembeli_18 newNode = new Pembeli_18(null, b, c, head1);
            head1.prev = newNode;
            head1 = newNode;
        }
        size++;
    }
    public void addLast(String b, String c){
        if (isEmpty()){
            addFirst(b, c);
        }else{
            Pembeli_18 current = head1;
            while (current.next != null){
                current = current.next;
            }
            Pembeli_18 newNode = new Pembeli_18(current, b, c, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head1.next == null){
            head1 = null;
            size--;
            return;
        }
        Pembeli_18 current = head1;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            head1 = head1.next;
            head1.prev = null;
            size--;
        }
    }

    public void addFirst1(int a, String b, int c){
        if (isEmpty1()){
            head2  = new Pesanan_18(null, a, b, c, null);
        }else{
            Pesanan_18 newNode = new Pesanan_18(null, a, b, c,  head2);
            head2.prev = newNode;
            head2 = newNode;
        }
        size++;
    }
    public void addLast1(int a, String b, int c){
        if (isEmpty1()){
            addFirst1(a, b, c);
        }else{
            Pesanan_18 current = head2;
            while (current.next != null){
                current = current.next;
            }
            Pesanan_18 newNode = new Pesanan_18(current, a, b, c, null);
            current.next = newNode;
            size++;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Pembeli_18 tmp = head1;
            while(tmp != null){
                System.out.println();

                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong !");
        }
    }
}
