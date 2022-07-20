package BuilderPattern;

public class Application {
    public static void main(String[] args) {
        SportCar.Builder builder = new SportCar.Builder("3000CC");
        SportCar sportCar = builder.muffler("Long").alloyWheel("Black").build();
        System.out.println(sportCar);
    }
}
