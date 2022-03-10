package models;

public class Professor {
	//1. mainīgie
	private String name;
	private String surname;
	private ProfDegree degree;
	private int id;
	
	private static int idCounter = 0;
	
	//2.1 get funkcijas
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
		
	public int getId() {
		return id;
	}
	
	//2.2.set funkcijas
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
	public void setDegree(ProfDegree degree) {
		if(degree!=null)
		{
			this.degree = degree;
		}
		else
		{
			this.degree = ProfDegree.master;
		}
	}
	
	public void setId()
	{
		this.id  =idCounter;
		idCounter++;
	}
	
	
	
	//3.konstruktori
	public Professor()
	{
		setId();
		setName("Test");
		setSurname("Professor");
		setDegree(ProfDegree.doctor);
	}
	//Professor prof1 = new Professor("Karina","Skirmante", ProfDegree.master);
	public Professor(String name, String surname, ProfDegree degree)
	{
		setId();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	//Professor [name=Karina, surname=Skirmante, degree=master]
	/*@Override
	public String toString() {
		return "Professor [name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}*/
	
	//4.toString
	//"1 Karina Skirmante master"
	public String toString()
	{
		return id+" "+name + " " + surname + " " + degree;
	}
	
	
	
	
	
	
	
	

}
