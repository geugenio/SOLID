public class LightBulb implements InterfaceLight {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }
    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}