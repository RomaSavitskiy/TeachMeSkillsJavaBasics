package teachmeskills.lesson6.computer.entity;

public class Computer {
    private long priceComputer;
    private String modelComputer;
    private RAM ramComputer;
    private HDD hddComputer;

    public Computer(long price, String model) {
        this.priceComputer = price;
        this.modelComputer = model;
    }

    public Computer(long price, String model, RAM ramComputer, HDD hddComputer) {
        this.priceComputer = price;
        this.modelComputer = model;
        this.ramComputer = ramComputer;
        this.hddComputer = hddComputer;
    }

    public long getPriceComputer() {
        return priceComputer;
    }

    public String getModelComputer() {
        return modelComputer;
    }

    public RAM getRamComputer() {
        return ramComputer;
    }

    public HDD getHddComputer() {
        return hddComputer;
    }

    public void setPriceComputer(long priceComputer) {
        this.priceComputer = priceComputer;
    }

    public void setModelComputer(String modelComputer) {
        this.modelComputer = modelComputer;
    }

    public void setRamComputer(RAM ramComputer) {
        this.ramComputer = ramComputer;
    }

    public void setHddComputer(HDD hddComputer) {
        this.hddComputer = hddComputer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + priceComputer +
                ", model='" + modelComputer + '\'' +
                ", RAM=" + ramComputer +
                ", HDD=" + hddComputer +
                '}';
    }
}
