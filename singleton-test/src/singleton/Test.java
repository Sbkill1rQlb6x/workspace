package singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintSpooler p1=PrintSpooler.getInstance();
			p1.change();
			p1.delete();
			p1.stop();
			
		} catch (PrintSpoolerException p) {
			// TODO: handle exception
			p.printStackTrace();
		}
		try {
			PrintSpooler p2=PrintSpooler.getInstance();
			p2.change();
			p2.delete();
			p2.stop();
		} catch (PrintSpoolerException p) {
			// TODO: handle exception
			p.printStackTrace();
		}
	}

}
