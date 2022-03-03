package models;

public class Professor {
	//1. mainīgie
	private String name;
	private String surname;
	private ProfDegree degree;
	
	//2. get funkcijas
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	
	//set funkcijas
	public void setName(String name) {
		if(name.matches("[A-Z]{1}[a-z]+"))
		{
			this.name = name;
		}
		else
		{
			this.name = "notknown";
		}
	}
	
	
	
	
	
	
	

}
