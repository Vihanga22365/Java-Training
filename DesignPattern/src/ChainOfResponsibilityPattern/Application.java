package ChainOfResponsibilityPattern;

public class Application {

    public static void main(String[] args) {
        Banker banker = new Banker();
        Manager manager = new Manager();
        AreaHeadManager areaHeadManager = new AreaHeadManager();

        banker.setSuccessor(manager);
        manager.setSuccessor(areaHeadManager);

        Bank bank1 = new Bank(200000.00, 5);
        System.out.println(banker.approveMoneyWithdraw(bank1));

        Bank bank2 = new Bank(2000000000.00, 10);
        System.out.println(banker.approveMoneyWithdraw(bank2));
    }
}
