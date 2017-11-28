package factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVFactory tvFactory=new TVFactory();
		TV tv1=tvFactory.produceTV("Haier");
		tv1.play();
		TV tv2=tvFactory.produceTV("Hisense");
		tv2.play();
	}

}
