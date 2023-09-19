import java.util.Scanner;

public class PRAK105_2210817210012_MuhammadRakaAzwar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String makanan = in.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobi = in.nextLine();
        System.out.println("Aku Suka Makan "+makanan+", dan Hobiku "+hobi);
    }
}