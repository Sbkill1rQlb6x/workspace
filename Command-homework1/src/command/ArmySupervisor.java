package command;

public class ArmySupervisor {

  private Command command;

public void setCommand(Command command) {
	this.command = command;
}
	
  public void startExecuteCommand()
  {
	  command.execute();
  }
}
