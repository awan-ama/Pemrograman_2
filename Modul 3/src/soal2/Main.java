package soal2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> listBulan = new HashMap<>();
        listBulan.put(1, "Januari");
        listBulan.put(2, "Februari");
        listBulan.put(3, "Maret");
        listBulan.put(4, "April");
        listBulan.put(5, "Mei");
        listBulan.put(6, "Juni");
        listBulan.put(7, "Juli");
        listBulan.put(8, "Agustus");
        listBulan.put(9, "September");
        listBulan.put(10, "Oktober");
        listBulan.put(11, "November");
        listBulan.put(12, "Desember");

        LinkedList<Negara> listNegara = new LinkedList<>();
        int banyakNegara = input.nextInt();
        input.nextLine();
        for (int i = 0; i < banyakNegara; i++) {
            String namaNegara = input.nextLine();
            String kepemimpinan = input.nextLine();
            String NamaPemimpin = input.nextLine();
            int tanggal = 0;
            int bulan = 0;
            int tahun = 0;
            if (kepemimpinan.equals("monarki")){

            }
            else {
                tanggal = input.nextInt();
                bulan = input.nextInt();
                tahun = input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(namaNegara, kepemimpinan, NamaPemimpin, tanggal, bulan, tahun);
            listNegara.add(negara);
        }
        for (Negara negara : listNegara){
            System.out.println("Negara " + negara.getNamaNegara() + " Mempunyai " + (negara.getJenisKepemimpinan().equals("monarki") ? "Raja" : negara.getJenisKepemimpinan().equals("presiden") ? "Presiden":"Perdana Menteri") + " Bernama " + negara.getNamaPemimpin());
            if (!negara.getJenisKepemimpinan().equals("monarki")){
                System.out.println("Deklarasi Kemerdekaan pada tanggal " + negara.getTanggal() + " " +listBulan.get(negara.getBulan()) + " " + negara.getTahun());
            }
        }
    }
}