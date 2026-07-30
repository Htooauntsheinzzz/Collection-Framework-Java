package additionals_courses;

public class Student {
	
	
	private String studentId;
	
	private String name;
	
	private int age;

	public Student(String studentId, String name, int age) {
	
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	public void showStudentInfo() {
		System.out.println("Student Id : "+ studentId);
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		
		System.out.println("------------------------");
	}
	
	
	
	
	
	

}
