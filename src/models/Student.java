package models;

public class Student {
	//1.mainīgie
	private int id;
	private String name;
	private String surname;
	
	private static int idCounter = 10000;
	//2.1. get funkcijas
	public int getId() {
		return id;
	}	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	//2.2. set funkcijas
	public void setId()
	{
		this.id  =idCounter;
		idCounter++;
	}
	public void setName(String name) { 
		if(name!=null && name.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+")) //\p{L}+
		{
			this.name = name;
		}
		else
		{
			this.name = "notknown";
		}
	}
	
	public void setSurname(String surname)
	{
		if(surname!=null && surname.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+")) //\p{L}+
		{
			this.surname = surname;
		}
		else
		{
			this.surname = "notknown";
		}
	}
	
	
	//3.konstruktori
	public Student()
	{
		setId();
		setName("Test");
		setSurname("Student");
	}
	public Student(String name, String surname)
	{
		setId();
		setName(name);
		setSurname(surname);
	}
	//4.toString funkcija
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
}
