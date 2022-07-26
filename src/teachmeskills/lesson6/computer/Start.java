package teachmeskills.lesson6.computer;

import teachmeskills.lesson6.computer.entity.Computer;
import teachmeskills.lesson6.computer.entity.HDD;
import teachmeskills.lesson6.computer.entity.RAM;

public class Start {
    public static void main(String[] args) {
        int computerPrice1 = 100;
        String computerModel = "HP";

        Computer firstComputer = new Computer(computerPrice1, computerModel);

        String nameHDD = "Seagate";
        long sizeHDD = 2048L;
        String typeHDD = "Внутренний";

        HDD HDD1 = new HDD(nameHDD, sizeHDD, typeHDD);

        String nameRAM = "Hynix";
        int sizeRAM = 16;

        RAM RAM1 = new RAM(nameRAM, sizeRAM);

        int computerPrice2 = 200;
        String computerModel2 = "Asus";

        Computer secondComputer = new Computer(computerPrice2, computerModel2, RAM1, HDD1 );

        System.out.println(firstComputer);
        System.out.println(secondComputer);
    }
}
