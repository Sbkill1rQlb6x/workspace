package adapter;

public class Facade {

	private Alerter alerter;

	private Light1 light1;

	private RemoteSensor remoteSensor;

	private VideoRecorder1 videoRecorder1;

	private VideoRecorder2 videoRecorder2;

	private Light2 light2;

	private Light3 light3;



	public  Facade() {
		alerter=new Alerter();
		light1=new Light1();
		light2=new Light2();
		light3=new Light3();
		remoteSensor=new RemoteSensor();
		videoRecorder1=new VideoRecorder1();
		videoRecorder2=new VideoRecorder2();
	}

	public void turnOnAll() {
		alerter.turnOn();
		light1.turnOn();
		light2.turnOn();
		light3.turnOn();
		remoteSensor.turnOn();
		videoRecorder1.turnOn();
		videoRecorder2.turnOn();
	}

	public void turnOffAll() {
		alerter.turnOff();
		light1.turnOff();
		light2.turnOff();
		light3.turnOff();
		remoteSensor.turnOff();
		videoRecorder1.turnOff();
		videoRecorder2.turnOff();
	}

}
