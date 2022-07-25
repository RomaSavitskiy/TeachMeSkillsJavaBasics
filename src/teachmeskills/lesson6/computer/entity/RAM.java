package teachmeskills.lesson6.computer.entity;

public class RAM {
    private String nameRAM;
    private int sizeRAM;

    public RAM() {
    }

    public RAM(String nameRAM, int sizeRAM) {
        this.nameRAM = nameRAM;
        this.sizeRAM = sizeRAM;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "nameRAM='" + nameRAM + '\'' +
                ", sizeRAM=" + sizeRAM +
                '}';
    }
}
