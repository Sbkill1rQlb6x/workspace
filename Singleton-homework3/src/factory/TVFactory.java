package factory;

public class TVFactory {

	private TV tv;
	private static TVFactory tvFactory=new TVFactory();
	
	private TVFactory(){
		
	}
	
	public static TVFactory getInstance()
	{
		return tvFactory;
		
	}

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
