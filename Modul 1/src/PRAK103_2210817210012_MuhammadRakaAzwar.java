import java.util.Scanner;

public class PRAK103_2210817210012_MuhammadRakaAzwar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        int N = sc.nextInt();
        System.out.print(" ");
        int AngkaPertama = sc.nextInt();

        int Baris = 1;
        int Angka = AngkaPertama;
        do {
            if (Angka % 2 != 0) {
                System.out.print(Angka);
                if (Baris != N) {
                    System.out.print(", ");
                }
                Angka += 2;
            }
            Baris++;
        } while (Baris <= N);
    }
}