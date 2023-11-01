package soal1;
import java.util.LinkedList;

public class Dadu {
    public int input;
    public int minInput = 1;
    public int maxInput = 6;
    int diceTotal;

    public void setMaxInput(int maxInput){
        this.input = maxInput;
    }

    void AcakNilai(){
        LinkedList <Integer> diceList = new LinkedList<Integer>();
        diceList.add(1);diceList.add(2);diceList.add(3);diceList.add(4);diceList.add(5);diceList.add(6);
        for (int i = 0; i < input; i++){
            int randomInteger = (int)Math.floor(Math.random() * (maxInput - minInput + 1) + minInput);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + randomInteger);
            diceTotal += randomInteger;
        }
        System.out.println("Total nilai dadu keseluruhan " + diceTotal);
    }
}