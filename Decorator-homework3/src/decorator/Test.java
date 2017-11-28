package decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h=new SimpleHouse();
		System.out.println("No decorate house:");
		h.decorate();
		h=new RedDecorator(h);
		h=new CurtainsDecorator(h);
		System.out.println("Decorate house:");
		h.decorate();

	}

}
