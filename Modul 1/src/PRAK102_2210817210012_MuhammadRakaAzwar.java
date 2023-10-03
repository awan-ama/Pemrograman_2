import java.util.Scanner;

public class PRAK102_2210817210012_MuhammadRakaAzwar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        int Angka = sc.nextInt();
        int Deret = 1;

        while (Deret <= 11) {
            int Bilangan;
            if (Angka % 5 == 0) {
                Bilangan = (Angka / 5) - 1;
            } else {
                Bilangan = Angka;
            }
            System.out.print(Bilangan + ", ");
            Angka++;
            Deret++;
        }
    }
}