package Soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n, r;

        n = input.nextLine();
        r = input.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(n, r);
        hewan.display();
    }
}