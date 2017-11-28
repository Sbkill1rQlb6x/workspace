package adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoElectricOutlet TV=new TV();
		TV.work();
		
		TwoElectricOutlet washingMachine=new ThreeElectricOutlet(new WashingMachine());
		washingMachine.work();
	}

}
