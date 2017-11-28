package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef chef=new Chef();
		Barbecue chicken=new BarbecueChicken(chef);
		Barbecue muttonString=new BarbecueMuttonString(chef);
		Servant servant=new Servant();
		servant.setChicken(chicken);
		servant.setMuttonString(muttonString);
		servant.barbecueChicken();
		servant.barbecueMuttonString();
	}

}
