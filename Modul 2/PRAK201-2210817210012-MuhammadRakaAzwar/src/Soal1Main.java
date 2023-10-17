public class Soal1Main {
    public static void main(String[] args) {
        Buah b1 = new Buah("Apel", 0.4, 7000.0, 40.0);
        Buah b2 = new Buah("Mangga", 0.2, 3500.0, 15.0);
        Buah b3 = new Buah("Alpukat", 0.25, 10000.0, 12.0);

        b1.info();
        b2.info();
        b3.info();
    }
}