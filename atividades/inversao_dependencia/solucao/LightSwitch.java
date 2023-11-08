public class LightSwitch {
    private InterfaceLight dispositivo;

    public LightSwitch(InterfaceLight dispositivo) {
        this.dispositivo = dispositivo;
    }
    public void press(){
        if (dispositivo != null) {
            if (dispositivo.isOn()){
                dispositivo.turnOn();
            } else {
                dispositivo.turnOn();
            }
        }
    }
}