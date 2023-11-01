package soal2;

public class Negara {
    private String namaNegara;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggal;
    private int bulan;
    private int tahun;

    public Negara(String namaNegara, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.namaNegara = namaNegara;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String getNamaNegara() {
        return namaNegara;
    }
    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
    public String getNamaPemimpin() {
        return namaPemimpin;
    }
    public Integer getTanggal() {
        return tanggal;
    }
    public Integer getBulan() {
        return bulan;
    }
    public Integer getTahun() {
        return tahun;
    }
}