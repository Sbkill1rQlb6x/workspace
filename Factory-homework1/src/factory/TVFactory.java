package factory;

public class TVFactory {

	private TV tv;

	public TV produceTV(String brand) {
		
		if(brand.equals("Haier"))
		{
			tv=new HaierTV();
		}
		else if(brand.equals("Hisense"))
		{
			tv=new HisenseTV();
		}
		return tv;
	}

}
