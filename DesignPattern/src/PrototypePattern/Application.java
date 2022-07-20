package PrototypePattern;

public class Application {
    public static void main(String[] args) {
        Registry registry = new Registry();

        MobilePhone mobilePhone1 = (MobilePhone) registry.getItem(ItemType.PHONE);
        System.out.println(mobilePhone1);

        MobilePhone mobilePhone2 = (MobilePhone) registry.getItem(ItemType.PHONE);
        System.out.println(mobilePhone2);
        mobilePhone2.setCamera("30MP");
        System.out.println(mobilePhone2);
    }
}
