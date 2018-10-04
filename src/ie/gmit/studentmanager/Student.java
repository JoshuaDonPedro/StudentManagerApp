package ie.gmit.studentmanager;

public class Student {
	private String name;
	private int age;
	private course course;
	private address address;
	 
	//--> Finish declaring the rest of instance variables

	// Constructor #1 - the Default Constructor
	public Student()
	{
		name = "no name given";
		age = -1;
		
	}
	
		//--> ADD LINES OF CODE HERE TO COMPLETE CONSTRUCTOR #2
	//	public Address(string name)
		//this.name = name;
	//	this.age = age;
		
	

	// allows changing of the age
	public void setAge(int newAge)
	{
		age = newAge;
	}

	// allows changing of the name
	public void setName(String newName)
	{
		name = newName;
	}

	

	// returns the name of the student
	public String getName()
	{
		return name;
	}

	// returns the age of the student
	public int getAge()
	{
		return age;
	}

	

	// Create a public method olderStudent that takes a Student parameter
	// and returns the Student which is older or if they are the same returns the caller.
	// Follow the example for betterGPA.
	//-->
	public Student olderStudent(Student other)
		{
			if (age >= other.getAge()) {
				return this;
			} else {
				return other;
			}
		}

	// Observe how this method works. This method prints out the student's details.
	public void print()
	{
		System.out.println(
				"\r\nName: " + name
				+ "\r\nAge: " + age
			
				);
	}

	// Create an overloaded public method print that takes an integer parameter n
	// and prints the student's details n number of times.
	//-->
		public void print(int n)
		{
			for (int x = 1; x <= n; x++)
			{
				System.out.println(
					"\r\nName: " + name
					+ "\r\nAge: " + age
				
					);
			}
	}

}