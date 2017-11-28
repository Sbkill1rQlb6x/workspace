package factory;

public class PetFactory {

	private Pet pet;

	public Pet getPet(String voice) {
		if(voice.equals("嘎嘎"))
		{
			pet=new PetDuck();
		}
		return pet;
	}

}
