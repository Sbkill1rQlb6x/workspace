package decorator;

public abstract class IcecreamDecorator implements Icecream {

	 Icecream specialIcecream;

	public IcecreamDecorator(Icecream specialIcecream) {
		this.specialIcecream=specialIcecream;
	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream();
	}

}
