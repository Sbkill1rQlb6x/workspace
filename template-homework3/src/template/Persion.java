package template;

public abstract  class Persion {

	public abstract void dressUp();

	public abstract void eatBreakfast();

	public abstract void takeThings();

	public void prepareGotoSchool() {
		dressUp();
		eatBreakfast();
		takeThings();
	}

}
