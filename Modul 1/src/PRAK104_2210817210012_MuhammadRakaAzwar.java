import java.util.Scanner;

public class PRAK104_2210817210012_MuhammadRakaAzwar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        char Abu1 = sc.next().charAt(0);
        System.out.print(" ");
        char Abu2 = sc.next().charAt(0);
        System.out.print(" ");
        char Abu3 = sc.next().charAt(0);
        System.out.print("Tangan Bagas: ");
        char Bagas1 = sc.next().charAt(0);
        System.out.print(" ");
        char Bagas2 = sc.next().charAt(0);
        System.out.print(" ");
        char Bagas3 = sc.next().charAt(0);

        int SkorAbu = 0;
        int SkorBagas = 0;

        if ((Abu1 == 'B' && Bagas1 == 'G') ||
                (Abu1 == 'G' && Bagas1 == 'K') ||
                (Abu1 == 'K' && Bagas1 == 'B')) {
            SkorAbu++;
        } else if ((Abu1 == 'G' && Bagas1 == 'B') ||
                (Abu1 == 'K' && Bagas1 == 'G') ||
                (Abu1 == 'B' && Bagas1 == 'K')) {
            SkorBagas++;
        }

        if ((Abu2 == 'B' && Bagas2 == 'G') ||
                (Abu2 == 'G' && Bagas2 == 'K') ||
                (Abu2 == 'K' && Bagas2 == 'B')) {
            SkorAbu++;
        } else if ((Abu2 == 'G' && Bagas2 == 'B') ||
                (Abu2 == 'K' && Bagas2 == 'G') ||
                (Abu2 == 'B' && Bagas2 == 'K')) {
            SkorBagas++;
        }

        if ((Abu3 == 'B' && Bagas3 == 'G') ||
                (Abu3 == 'G' && Bagas3 == 'K') ||
                (Abu3 == 'K' && Bagas3 == 'B')) {
            SkorAbu++;
        } else if ((Abu3 == 'G' && Bagas3 == 'B') ||
                (Abu3 == 'K' && Bagas3 == 'G') ||
                (Abu3 == 'B' && Bagas3 == 'K')) {
            SkorBagas++;
        }

        if (SkorAbu > SkorBagas) {
            System.out.println("Abu");
        } else if (SkorAbu < SkorBagas) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}