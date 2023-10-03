import java.util.Scanner;

public class PRAK101_2210817210012_MuhammadRakaAzwar {
    public static void main(String[] args){
        String NamaPanjang;
        String TempatLahir= "";
        int TanggalLahir, BulanLahir, TahunLahir, TinggiBadan;
        float BeratBadan;

        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan Nama Lengkap : ");
        NamaPanjang = sc.nextLine();
        System.out.print("Masukan Tempat Lahir : ");
        TempatLahir = sc.next();
        System.out.print("Masukan Tanggal Lahir : ");
        TanggalLahir = sc.nextInt();
        System.out.print("Masukan Bulan Lahir : ");
        BulanLahir = sc.nextInt();
        System.out.print("Masukkan Tahun Lahir : ");
        TahunLahir = sc.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        TinggiBadan = sc.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        BeratBadan = sc.nextFloat();

        String[] NamaBulan = new String[] {"takAda", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" };

        System.out.print("Nama Lengkap "+ (NamaPanjang)+", Lahir di "+ (TempatLahir)+ " pada Tanggal "+ (TanggalLahir)+" "+ NamaBulan[BulanLahir] +" "+(TahunLahir)+ " Tinggi Badan "+(TinggiBadan)+" cm"+ " dan Berat Badan "+(BeratBadan)+" kilogram");
    }
}