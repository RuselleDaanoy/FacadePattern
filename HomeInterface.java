public class HomeInterface {
    public HomeService light;
    public HomeService tv;
    public HomeService airConditioning;

    public HomeInterface(HomeService light, HomeService tv, HomeService airConditioning) {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    public String turnOnAll() {
        return light.turnOn() + "\n" + tv.turnOn() + "\n" + airConditioning.turnOn();
    }

    public String turnOffAll() {
        return light.turnOff() + "\n" + tv.turnOff() + "\n" + airConditioning.turnOff();
    }
}