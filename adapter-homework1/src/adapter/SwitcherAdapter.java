package adapter;

public class SwitcherAdapter implements IStandardSwitchable {
	private Light light;
	
	public SwitcherAdapter(Light light) {
		this.light=light;
	}

	@Override
	public void connectElectricCurrent() {
		// TODO Auto-generated method stub
		light.turnOn();
		light.turnOff();
		
	}

}
