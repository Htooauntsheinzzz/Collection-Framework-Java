package additionals_courses;

public interface StudentService {
	
	void addStudent(Student student)  throws StudentExistsException;
	
	void showAllStudents();
	
	void showStudentIds();
	
	void showStudentsName();
	
	void searchStudentId(String studentId);
	
}
