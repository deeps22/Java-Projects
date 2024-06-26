package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		int count = 0;
		while(true) {
			if(count!=0) {
				System.out.println("/n/n/n Do you want to continue, then press 'yes'");
				String continues = sc.next();
				if(continues.equalsIgnoreCase("yes")) {
					
				}
				else {
					System.exit(0);
				}
			}
			count++;
			System.out.println("\t\t\t\t\tStudent Project Management");
			System.out.println("=========================================");
			System.out.println("1.Add Student\n"
					+ "2.Update Student\n"
					+ "3.Display Student\n"
					+ "4.Delete Student\n"
					+ "5.Exit\n");
			System.out.println("Please select operation : ");
			int option = sc.nextInt();
			
			// switch for particular operation
			switch(option) {
			case 1:
				//Add Student
				Student student = StudentUtility.addStudent();
				studentList.add(student);
				System.out.println("Student Added Successfully.");
				break;
				
			case 2:
				//Update Student
				StudentUtility.updateStudent(studentList);
				System.out.println("Student Updated Successfully");
				break;
				
			case 3:
				//Display Student
				StudentUtility.displayAllStudent(studentList);
				break;
				
			case 4:
				//Delete Student
				System.out.println("Delete Student option is proceed?");
				System.out.println("Enter StudentId: ");
				int sid = sc.nextInt();
				StudentUtility.deleteStudent(studentList, sid);
				System.out.println("Student Deleted Successfully.");
				break;
				
			case 5:
				// stop the program execution
				System.exit(0);
				break;
				
			default:
				System.err.println("Please enter correct option");
				break;
			}
		}

	}

}
