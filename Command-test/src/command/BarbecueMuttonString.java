package command;

public class BarbecueMuttonString implements Barbecue {

	private Chef chef;

	public void execute() {
		chef.barbecueMuttonString();
	}

	public  BarbecueMuttonString(Chef c) {
		this.chef=c;
	}

}
