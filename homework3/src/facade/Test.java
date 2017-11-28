package facade;

public class Test {
	 public static void main(String[] args) {
		 Camera c1=new Camera();
		 Camera c2=new Camera();
		 Light l1=new Light();
		 Light l2=new Light();
		 Light l3=new Light();
		 Sensor s1=new  Sensor();
		 Alarm a1=new Alarm();
		 SecurityFacade sf=new SecurityFacade(c1,c2,l1,l2,l3,s1,a1);
		 sf.activate();
		 sf.deactivate();
	 }
}
