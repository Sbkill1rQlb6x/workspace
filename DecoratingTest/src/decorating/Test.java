package decorating;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     		Window window=new Windows();
		    ScrollingWindowDecorator swd=new VerticalScroll(window);
			System.out.println(swd.scroll());
		
		
	}

}
