package command;

public class Servant {

	private Barbecue chicken;

	private Barbecue muttonString;

	public void setChicken(Barbecue chicken) {
			this.chicken=chicken;
	}

	public void setMuttonString(Barbecue muttonString) {
		this.muttonString=muttonString;
	}

	public void barbecueMuttonString()
	{
		System.out.print("顾客点的是：");
		muttonString.execute();
	}
	public void barbecueChicken()
	{
		System.out.print("顾客点的是：");
		chicken.execute();
	}
}
