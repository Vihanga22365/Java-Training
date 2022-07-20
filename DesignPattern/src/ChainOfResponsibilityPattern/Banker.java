package ChainOfResponsibilityPattern;

public class Banker extends Handler {

    @Override
    public String approveMoneyWithdraw(Bank bank) {
        if (bank.getAmount() >= 0.00 && bank.getAmount() <= 500000.00) {
            return "The money was withdrawn from the Bank";
        } else {
            return successor.approveMoneyWithdraw(bank);
        }
    }
}
