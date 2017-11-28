package command;

public class ConcreteCommand implements Command {

	private CompanyArmy army;
	public ConcreteCommand(CompanyArmy army) {
		this.army=army;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		army.sneakAttack();
	}

}
