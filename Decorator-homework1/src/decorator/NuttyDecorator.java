package decorator;

public class NuttyDecorator extends IcecreamDecorator {

	
	public  NuttyDecorator(Icecream specialIcecream) {
		super(specialIcecream);
	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream()+this.addNuts();
	}

	public String addNuts() {
		return ",addNutty!";
	}

}
