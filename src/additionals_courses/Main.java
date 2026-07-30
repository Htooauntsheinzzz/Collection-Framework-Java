package additionals_courses;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws StudentExistsException {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		StudentService service = new StudentServiceImpl();
		
		
		int choice;
		
		do {
			System.out.println("\n=======Register Student System======");
			
			System.out.println("1. Add Student");
			
			System.out.println("2. Show Student Id");
			
			System.out.println("3. Show Student Name");
			
			System.out.println("4. Show All Student");
			
			System.out.println("5. Search Student ID");
			
			System.out.println("6. Exist System");
			
			
			choice = Integer.parseInt(sc.nextLine());
			
			
			
		
			if (choice ==1 ) {
				
				System.out.println("Enter Stduent ID");
				
				String studentId = sc.nextLine();
				
				
				System.out.println("Enter Stduent Name");
				
				String name = sc.nextLine();
				
				System.out.println("Enter Stduent Age");
				
				int age = Integer.parseInt(sc.nextLine());
				
				Student student = new Student(studentId, name, age);
				
				
				service.addStudent(student);
				
				
			}else if(choice == 2) {
				
				
				service.showStudentIds();
				

			}else if(choice==3) {
				
				
				service.showStudentsName();
			
			}else if (choice ==4) {
				
				service.showAllStudents();
				
			}else if (choice == 5) {
				
				System.out.println("Enter Student Id");
				
				String id = sc.nextLine();
				
				service.searchStudentId(id);
			}else if(choice == 6) {
				
				
				System.out.println("Thank you next time");
				
			}else {
				System.out.println("Invalid Choice");
			}
		
		

	}while(choice != 6);
		
		sc.close();
	}
	
}
