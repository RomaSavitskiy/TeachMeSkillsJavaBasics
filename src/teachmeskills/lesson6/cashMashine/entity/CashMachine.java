package teachmeskills.lesson6.cashMashine.entity;

public class CashMachine {

    private long amount20;
    private long amount50;
    private long amount100;

    public CashMachine(long amount20, long amount50, long amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    public void setAmount20(long amount20) {
        this.amount20 = amount20;
    }

    public void setAmount50(long amount50) {
        this.amount50 = amount50;
    }

    public void setAmount100(long amount100) {
        this.amount100 = amount100;
    }

    public long getAmount20() {
        return amount20;
    }

    public long getAmount50() {
        return amount50;
    }

    public long getAmount100() {
        return amount100;
    }
}
