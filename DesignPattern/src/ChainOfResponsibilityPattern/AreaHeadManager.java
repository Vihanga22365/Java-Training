package ChainOfResponsibilityPattern;

public class AreaHeadManager extends Handler {

    @Override
    public String approveMoneyWithdraw(Bank bank) {
        if (bank.getAmount() > 10000000.00) {
            return "The money was withdrawn from the Area Manager";
        } else {
            return successor.approveMoneyWithdraw(bank);
        }
    }
}
