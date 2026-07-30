package additionals_courses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class StudentServiceImpl implements StudentService{
	
	private ArrayList<Student> students = new ArrayList<Student>();
	
	private HashSet<String> studentIds = new HashSet<String>();
	
	private LinkedHashSet<String> studentNames = new LinkedHashSet<String>();
	
	
	

	@Override
	public void addStudent(Student student) throws StudentExistsException {

		if (studentIds.contains(student.getStudentId())) {
			throw new StudentExistsException("Your Student ID is Already Exists");
		}else {
			students.add(student);
			
			studentIds.add(student.getStudentId());
			
			
			studentNames.add(student.getName());
			
			System.out.println("Student Add Successfully");
			
		}
		
	}

	@Override
	public void showAllStudents() {
		
		
		if(students.isEmpty()) {
			System.out.println("No Student Found");

		}else {
			
			Spliterator<Student> spliterator = students.spliterator();
			
			spliterator.forEachRemaining( (s) -> s.showStudentInfo());
		}
		
	}

	@Override
	public void showStudentIds() {

		System.out.println("\nStudent Register ID");
		
		Spliterator<String> studentIdSpliterator = studentIds.spliterator();
		
		studentIdSpliterator.forEachRemaining( (id) -> System.out.println(id));
		
		
		
	}

	@Override
	public void showStudentsName() {
		
		System.out.println("\nStudent Register ID");
		
		Spliterator<String> studentNameSpliterator = studentNames.spliterator();
		
		studentNameSpliterator.forEachRemaining( (name) -> System.out.println(name));
		
	}

	@Override
	public void searchStudentId(String studentId) {
		
		if(studentIds.contains(studentId)) {
			System.out.println("Student ID found.");
		}else {
			System.out.println(studentId + " Not Found");
		}
		
	}

}
