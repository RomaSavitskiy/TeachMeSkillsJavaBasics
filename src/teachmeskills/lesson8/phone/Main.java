package teachmeskills.lesson8.phone;

public class Main {
    public static void main(String[] args) {
        Phone[] phoneArray = { new Phone(3213132, "Iphone 11", 194),
                new Phone(2213543, "Samsung S10", 157),
                new Phone(3321543, "Xiaomi Mi10", 208)};

        for (int i = 0; i < phoneArray.length; i++) {
            System.out.println(phoneArray[i].toString());
        }

        phoneArray[0].receiveCall("Владимир");
        phoneArray[1].receiveCall("Иосиф");
        phoneArray[2].receiveCall("Леонид");
        phoneArray[0].receiveCall("Владимир",  phoneArray[0].getNumberPhone());
        phoneArray[1].receiveCall("Иосиф", phoneArray[1].getNumberPhone());
        phoneArray[2].receiveCall("Леонид", phoneArray[2].getNumberPhone());
    }
}
