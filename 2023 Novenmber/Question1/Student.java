package Question1;

import java.util.Scanner;

public class Student {
	
	private String StudentID;
	private String name;
	private String address;
	private String contact;
	

	public Student(String studentID, String name, String address, String contact) {
		StudentID = studentID;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public void Read()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		StudentID = scan.next();
		
		System.out.println("Enter Name: ");
		name = scan.next();
		
		System.out.println("Enter address: ");
		address = scan.next();
		
		System.out.println("Enter contact: ");
		contact = scan.next();
	
	}
	
	public void Print()
	{
		System.out.println(StudentID);
		System.out.println(name);

		System.out.println(address);
		System.out.println(contact);
	}

}
