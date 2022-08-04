package teachmeskills.lesson7.positions;

public class Starter {
    public static void main(String[] args) {
    PositionsPrintable[] positionsPrintable= {new Worker(), new Accountant(), new Director()};

        for (int i = 0; i < positionsPrintable.length; i++) {
            positionsPrintable[i].positionPrint();
        }
    }
}
