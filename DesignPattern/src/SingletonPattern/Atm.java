package SingletonPattern;

public class Atm {
    private static volatile Atm atm;
    private Atm() {
        if (atm != null) {
            throw new RuntimeException("Use getInstance method");
        }
    }
    public static Atm getInstance() {
        if (atm == null) {
            synchronized (Atm.class) {
                if (atm == null) {
                    atm = new Atm();
                }
            }
        }
        return atm;
    }
    public void withDrawMoney() {
        System.out.println("You can withdraw money...");
    }

}
