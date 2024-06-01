package Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	
	private String courseID;
	private String name;
	private String Instructor;
	
public Course(String courseID, String name, String instructor) {
		this.courseID = courseID;
		this.name = name;
		Instructor = instructor;
	}

public Course() {
	// TODO Auto-generated constructor stub
}

public void Read()
{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter courseID: ");
	courseID = scan.next();
	
	System.out.println("Enter Name: ");
	name = scan.next();
	
	System.out.println("Enter Instructor: ");
	Instructor = scan.next();
	
	scan.close();

}
public void Print()
{
	System.out.println(courseID);
	System.out.println(name);
	System.out.println(Instructor);
}

public void AddStudent(Student student)
{
	ArrayList<Student> list = new ArrayList<>();
	list.add(student);
}

}
