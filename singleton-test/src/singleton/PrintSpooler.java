package singleton;

public class  PrintSpooler {

	private static PrintSpooler instance =null;

	private  PrintSpooler() {

	}

	public static PrintSpooler getInstance() throws PrintSpoolerException {
		if (instance==null) {
			instance=new PrintSpooler();
			return  instance;
		}
		else {
			throw new PrintSpoolerException("重复创建对象！");
		}
	}

	public void delete() {
		System.out.println("删除打印！");
	}

	public void stop() {
		System.out.println("终止打印！");
	}

	public void change() {
 System.out.println("更改打印");
	}

}
