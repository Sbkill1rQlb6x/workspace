package decorator;

public class CurtainsDecorator extends HouseDecorator{

	public CurtainsDecorator(House house) {
		super(house);
	}
	
	public void decorate() {
		house.decorate();
		addCurtains(house);
	}

	 

	public void addCurtains(House house) {
		System.out.println("addCurtains!");
	}

}
