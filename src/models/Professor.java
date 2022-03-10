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
	
	
	
	
	
	
	
	
	

}
