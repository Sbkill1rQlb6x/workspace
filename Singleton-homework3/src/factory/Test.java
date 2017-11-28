package factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVFactory tvFactory=TVFactory.getInstance();
		System.out.println("非懒汉单例模式实例化对象：");
		TV tv1=tvFactory.produceTV("Haier");
		tv1.play();
		TV tv2=tvFactory.produceTV("Hisense");
		tv2.play();
		TVFactory2 tvFactory2=TVFactory2.getInstance();
		System.out.println("懒汉单例模式实例化对象：");
		TV tv3=tvFactory2.produceTV("Haier");
		tv3.play();
		TV tv4=tvFactory.produceTV("Hisense");
		tv4.play();
	}

}
