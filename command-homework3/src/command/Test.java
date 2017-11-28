package command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder folder=new Folder("commandfoder1");
		Command command=new CreateFolder(folder);
		ReqCreateFolder reqCreateFolder=new ReqCreateFolder();
		reqCreateFolder.setCommand(command);
		reqCreateFolder.createFolderCommand();
		reqCreateFolder.undoCommand();
		
		Folder folder2=new Folder("commandfoder2");
		Command command2=new CreateFolder(folder2);
		ReqCreateFolder reqCreateFolder2=new ReqCreateFolder();
		reqCreateFolder2.setCommand(command2);
		reqCreateFolder2.createFolderCommand();
		
	}

}
