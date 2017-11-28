package command;

import java.io.File;

public class Folder {

	private String folderName;
	

	public Folder(String folderName) {
		this.folderName=folderName;
		
	}

	public void createFolder() {
		File file= new File(folderName);
		boolean m = file.mkdir();
		if (m) {
			System.out.println("文件夹创建成功！");
		}
		String absolutePath = file.getAbsolutePath();
		//System.out.println(absolutePath);
		
	}

	public void deleteFolder() {
		File file=new File(folderName);
		boolean delete = file.delete();
		if (delete) {
			System.out.println("文件夹删除成功！");
		}
	}

}
