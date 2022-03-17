package models;

public class Student extends Person {
	//1.mainīgie
	private int id;
	
	private static int idCounter = 10000;
	//2.1. get funkcijas
	public int getId() {
		return id;
	}	
	
	//2.2. set funkcijas
	public void setId()
	{
		this.id  =idCounter;
		idCounter++;
	}
		
	
	//3.konstruktori
	public Student()
	{
		super();
		setId();
		
	}
	public Student(String name, String surname)
	{
		super(name, surname);
		setId();
		
	}
	//4.toString funkcija
	@Override
	public String toString() {
		//return "Student [id=" + id + super.toString() + "]";

		return "Student [id=" + id + ", name=" + super.getName() + ", surname=" + super.getSurname() + "]";
	}
	
	
	
	
}
