package PrototypePattern;

public class MobilePhone extends Item {
    private String camera;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "camera='" + camera + '\'' +
                '}';
    }
}
