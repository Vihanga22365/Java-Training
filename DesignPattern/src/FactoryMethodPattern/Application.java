package FactoryMethodPattern;

public class Application {
    public static void main(String[] args) {
        MobilePackage mobilePackage1 = MobilePackageFactory.createMobilePackage(PackageCode.CALL);
        mobilePackage1.active();

        MobilePackage mobilePackage2 = MobilePackageFactory.createMobilePackage(PackageCode.INTERNET);
        mobilePackage2.active();
    }
}
