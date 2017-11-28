package adapter;

public class ThreeElectricOutlet  implements TwoElectricOutlet {

	private WashingMachine washingMachine;

	public ThreeElectricOutlet( WashingMachine washingMachine) {
		this.washingMachine=washingMachine;
	}

	public void work() {
		washingMachine.work();
	}

}
