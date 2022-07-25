package teachmeskills.lesson6.Computer.entity;

public class Computer {

    private long price;
    private String model;
    private RAM RAM;
    private HDD HDD;

    public Computer(long price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(long price, String model, RAM RAM, HDD HDD) {
        this.price = price;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public long getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public RAM getRAM() {
        return RAM;
    }

    public HDD getHDD() {
        return HDD;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRAM(RAM RAM) {
        this.RAM = RAM;
    }

    public void setHDD(HDD HDD) {
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                '}';
    }
}
