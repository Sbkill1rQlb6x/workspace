package factory;

public class TVFactory2 {

	private TV tv;
	private static TVFactory2 tvFactory=null;
	
	private TVFactory2(){
		
	}
	
	public static TVFactory2 getInstance()
	{
		if (tvFactory==null) {
			tvFactory=new TVFactory2();
		}
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
