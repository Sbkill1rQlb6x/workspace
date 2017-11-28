package adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light=new Light();
		IStandardSwitchable iStandardSwitchable=new SwitcherAdapter(light);
		iStandardSwitchable.connectElectricCurrent();
	}

}
