package command;

public class CreateFolder implements Command {

	private Folder folder;
	
	public CreateFolder(Folder folder) {
		this.folder=folder;
	}

	public void execute() {
		folder.createFolder();
	}

	public void undo() {
		folder.deleteFolder();
	}

	

}
