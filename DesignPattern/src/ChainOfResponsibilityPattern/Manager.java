package ChainOfResponsibilityPattern;

public class Manager extends Handler {

    @Override
    public String approveMoneyWithdraw(Bank bank) {
        if (bank.getAmount() > 500000.00 && bank.getAmount() <= 10000000.00) {
            return "The money was withdrawn from the Bank Manager";
        } else {
            return successor.approveMoneyWithdraw(bank);
        }
    }
}
