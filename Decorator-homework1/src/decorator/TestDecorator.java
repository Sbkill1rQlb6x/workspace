package decorator;

public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream ic=new SimpleIcecream();
		ic=new HoneyDecorator(ic);
		ic=new NuttyDecorator(ic);
		System.out.println(ic.makeIcecream());

	}

}
