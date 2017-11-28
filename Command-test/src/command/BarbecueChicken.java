package command;

public class BarbecueChicken implements Barbecue {

	private Chef chef;

	public void execute() {
		chef.barbecueChicken();
	}

	public  BarbecueChicken(Chef c) {
		this.chef=c;
	}

}
