package FactoryMethodPattern;

public class Internet extends MobilePackage {
    @Override
    public void active() {
        System.out.println("Active Internet Package");
    }
}
