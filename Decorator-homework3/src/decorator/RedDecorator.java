package decorator;

public class RedDecorator extends HouseDecorator {

	public RedDecorator(House house) {
		super(house);
		
	}
	
	public void decorate() {
		house.decorate();
		addRedColor(house);
	}

	

	public void addRedColor(House house) {
		System.out.println("addRedColor!,");
	}

}
