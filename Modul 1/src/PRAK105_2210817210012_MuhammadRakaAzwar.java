import java.util.Scanner;

public class PRAK105_2210817210012_MuhammadRakaAzwar {
    public static void main(String [] args){
        double JariJari, Tinggi, Kalkulasi;
        double pi = 3.14;
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        JariJari = sc.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        Tinggi = sc.nextDouble();
        Kalkulasi = (pi * (JariJari *JariJari*Tinggi));
        Kalkulasi = (double) Math.round(Kalkulasi * 1000d) / 1000d;

        System.out.print("Volume tabung dengan jari-jari "+JariJari+" dan tinggi "+Tinggi+" cm adalah "+Kalkulasi+" m3");
    }
}