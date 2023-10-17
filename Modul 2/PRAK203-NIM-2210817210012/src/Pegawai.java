//pada baris ini, error terjadi karena deklarasi class menggunakan nama yang berbeda dengan nama class file .java
//public class Employee {
public class Pegawai {
    public String nama;
    //pada baris ini, error terjadi karena tipe data yang digunakan tidak sesuai dengan value pada main
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //pada baris ini, error terjadi karena setter tidak menggunakan parameter
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
