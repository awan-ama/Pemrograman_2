package soal3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean isUnik = true;
                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        if (mahasiswa.getNIM().equals(nim)) {
                            isUnik = false;
                            break;
                        }
                    }

                    if (isUnik) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        listMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    } else {
                        System.out.println("NIM telah digunakan. Masukkan NIM unik.");
                    }
                    break;

                case 2:
                    input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String hapusNIM = input.nextLine();

                    for (int i = 0; i < listMahasiswa.size(); i++) {
                        if (listMahasiswa.get(i).getNIM().equals(hapusNIM)) {
                            listMahasiswa.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + hapusNIM + " dihapus.");
                            break;
                        }
                    }
                    break;

                case 3:
                    input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String cariNIM = input.nextLine();

                    boolean nimFound = false;
                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        if (mahasiswa.getNIM().equals(cariNIM)) {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                            nimFound = true;
                            break;
                        }
                    }

                    if (!nimFound) {
                        System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mahasiswa : listMahasiswa) {
                        System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                    }
                    break;
            }
        }
        while (pilihan != 0);

        System.out.println("Terima kasih!");
        listMahasiswa.clear();
    }
}