package command;

public class ReqCreateFolder{

	private Command command;

	public void setCommand(Command command) {
		this.command=command;
	}

	public void createFolderCommand() {
		command.execute();
	}

	public void undoCommand() {
		command.undo();
	}

}
