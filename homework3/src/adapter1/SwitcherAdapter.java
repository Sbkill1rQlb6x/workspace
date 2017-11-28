package adapter1;

public class SwitcherAdapter implements IStandardSwitchable {
	Light light;
	public SwitcherAdapter(Light light){
		this.light=light;
	}
	public void connectElectricCurrent(){
		light.turnOn();
		light.turnOff();
	}
}
