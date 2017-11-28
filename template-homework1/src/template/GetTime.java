package template;

public abstract class GetTime {
	public abstract void runcode();
	public void getTimeProcess(){
		long start=System.currentTimeMillis();
		runcode();
		long end=System.currentTimeMillis();
		System.out.println("程序运行毫秒="+(end-start));
	}
}
