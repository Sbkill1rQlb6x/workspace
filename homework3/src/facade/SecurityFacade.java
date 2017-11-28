package facade;

public class SecurityFacade {
	private Camera camera1,camera2;
	private Light light1,light2,light3;
	private Sensor sensor;
	private Alarm alarm;
	
	public SecurityFacade(Camera camera1, Camera camera2, Light light1,
			Light light2, Light light3, Sensor sensor, Alarm alarm) {
		this.camera1 = camera1;
		this.camera2 = camera2;
		this.light1 = light1;
		this.light2 = light2;
		this.light3 = light3;
		this.sensor = sensor;
		this.alarm = alarm;
	}

	public void activate(){
		camera1.turnOn();
		camera2.turnOn();
		light1.turnOn();
		light2.turnOn();
		light3.turnOn();
		sensor.turnOn();
		alarm.turnOn();
	}
	public void deactivate(){
		camera1.turnOff();
		camera2.turnOff();
		light1.turnOff();
		light2.turnOff();
		light3.turnOff();
		sensor.turnOff();
		alarm.turnOff();
	}
}
