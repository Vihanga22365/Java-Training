package FactoryMethodPattern;

public class MobilePackageFactory {
    public static MobilePackage createMobilePackage(PackageCode packageCode) {
        switch (packageCode) {
            case CALL:
                return new Call();
            case INTERNET:
                return new Internet();
            case SMS:
                return new Sms();
            default:
                return null;
        }
    }
}
