package pojo;

public class QuickManual {
	private String id;
	private String name;
	private String content;
	//Course 外键效果
	private Course course;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "QuickManual [id=" + id + ", name=" + name + ", content=" + content + ", course=" + course + "]";
	}
	
}
