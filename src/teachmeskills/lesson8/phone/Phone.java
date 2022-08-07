package teachmeskills.lesson8.phone;

public class Phone {
    private int numberPhone;
    private String modelPhone;
    private int weightPhone;

    public Phone(int numberPhone, String modelPhone, int weightPhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
    }

    public Phone() {
    }

    public Phone(int numberPhone, String modelPhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getModelPhone() {
        return modelPhone;
    }

    public void setModelPhone(String modelPhone) {
        this.modelPhone = modelPhone;
    }

    public int getWeightPhone() {
        return weightPhone;
    }

    public void setWeightPhone(int weightPhone) {
        this.weightPhone = weightPhone;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ": " + number);
    }

    public void sendMessage(int number) {
        System.out.println(number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "numberPhone=" + numberPhone +
                ", modelPhone='" + modelPhone + '\'' +
                ", weightPhone=" + weightPhone +
                '}';
    }
}
