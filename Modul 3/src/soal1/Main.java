package soal1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu d = new Dadu();
        int diceNumberInput = input.nextInt();

        d.setMaxInput(diceNumberInput);
        d.AcakNilai();
    }
}