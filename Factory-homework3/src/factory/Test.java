package factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetFactory petFactory=new PetFactory();
		Pet pet=petFactory.getPet("嘎嘎");
		pet.play();
	}

}
