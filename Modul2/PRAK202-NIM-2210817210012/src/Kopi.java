public class Kopi {
    public String namaKopi;
    public String ukuran;
    public int harga;
    public String pembeli;
    public double pajak;
    public String info;

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga * (1000d) / 1000d);
    }

    public String getPembeli() {
        return pembeli;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public double getPajak() {
        return pajak = 0.11 * harga;
    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }
}
