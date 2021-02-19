package autowiring;

public class Teacher {

	private String name;
	private Student student;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name Inject");
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		System.out.println("Student Inject");
		this.student = student;
	}
	
	
}
