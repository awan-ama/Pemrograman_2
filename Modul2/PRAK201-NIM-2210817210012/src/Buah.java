public class Buah {
    String nama;
    double berat;
    double harga;
    double jumlahBeli;

    Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    double hargaPreDiskon(){
        return jumlahBeli/berat * harga;
    }

    double hargaDiskon(){
        return Math.floor(jumlahBeli / 4) * 0.02 * harga * 4;
    }

    double hargaPostDiskon(){
        return hargaPreDiskon() - hargaDiskon();
    }

    public void info(){
        System.out.println("Nama Buah: "+ nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaPreDiskon());
        System.out.printf("Total Diskon: Rp%.2f\n", hargaDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hargaPostDiskon());
        System.out.println(" ");
    }
}
