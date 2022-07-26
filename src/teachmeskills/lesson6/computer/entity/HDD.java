package teachmeskills.lesson6.computer.entity;

public class HDD {
    private String nameHDD;
    private long sizeHDD;
    private String typeHDD;

    public HDD(String nameHDD, long sizeHDD, String typeHDD) {
        this.nameHDD = nameHDD;
        this.sizeHDD = sizeHDD;
        this.typeHDD = typeHDD;
    }

    public HDD(String nameHDD) {
    }

    @Override
    public String toString() {
        return "HDD{" +
                "nameHDD='" + nameHDD + '\'' +
                ", sizeHDD=" + sizeHDD +
                ", typeHDD='" + typeHDD + '\'' +
                '}';
    }
}
