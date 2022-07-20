package SingletonPattern;

public class Application {
    public static void main(String[] args) {
        Atm atm1 = Atm.getInstance();
        Atm atm2 = Atm.getInstance();

        atm1.withDrawMoney();
        System.out.println(atm1);

        atm2.withDrawMoney();
        System.out.println(atm2);
    }
}
