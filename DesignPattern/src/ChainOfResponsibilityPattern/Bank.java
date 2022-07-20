package ChainOfResponsibilityPattern;

public class Bank {
    private double amount;
    private int noDayWithdraw;

    public Bank(double amount, int noDayWithdraw) {
        this.amount = amount;
        this.noDayWithdraw = noDayWithdraw;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNoDayWithdraw() {
        return noDayWithdraw;
    }

    public void setNoDayWithdraw(int noDayWithdraw) {
        this.noDayWithdraw = noDayWithdraw;
    }
}
