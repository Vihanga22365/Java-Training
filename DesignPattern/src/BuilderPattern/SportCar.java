package BuilderPattern;

public class SportCar {

    private final String engine;
    private final String alloyWheel;
    private final String spoiler;
    private final String muffler;

    public SportCar(Builder builder) {
        this.engine = builder.engine;
        this.alloyWheel = builder.alloyWheel;
        this.spoiler = builder.spoiler;
        this.muffler = builder.muffler;
    }

    static class Builder {

        private String engine;
        private String alloyWheel;
        private String spoiler;
        private String muffler;

        public Builder(String engine) {
            this.engine = engine;
        }

        public Builder alloyWheel(String alloyWheel) {
            this.alloyWheel = alloyWheel;
            return  this;
        }

        public Builder spoiler(String spoiler) {
            this.spoiler = spoiler;
            return this;
        }

        public Builder muffler(String muffler) {
            this.muffler = muffler;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }

    }

    @Override
    public String toString() {
        return "SportCar{" +
                "engine='" + engine + '\'' +
                ", alloyWheel='" + alloyWheel + '\'' +
                ", spoiler='" + spoiler + '\'' +
                ", muffler='" + muffler + '\'' +
                '}';
    }
}
