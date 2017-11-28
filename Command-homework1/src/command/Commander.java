package command;

public class Commander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyArmy companyArmy=new CompanyArmy();
		Command concreteCommand=new ConcreteCommand(companyArmy);
		ArmySupervisor armySupervisor=new ArmySupervisor();
		armySupervisor.setCommand(concreteCommand);
		armySupervisor.startExecuteCommand();
	}

}
