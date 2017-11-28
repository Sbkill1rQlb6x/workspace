package decorator;

public abstract class HouseDecorator implements House {
	
	 House house;
	public HouseDecorator(House house) {
		this.house=house;
	}

	public void decorate() {
		house.decorate();
	}

	

}
