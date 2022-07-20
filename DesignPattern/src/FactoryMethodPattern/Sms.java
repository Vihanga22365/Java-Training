package FactoryMethodPattern;

public class Sms extends MobilePackage {
    @Override
    public void active() {
        System.out.println("Active SMS package");
    }
}
