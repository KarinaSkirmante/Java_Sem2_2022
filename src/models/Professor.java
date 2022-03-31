package models;

//Karinas komentārs, lai notestētu git versiju kontroli
public class Professor extends Person{//djfhdjkfydjknz,cjksdfd
	//1. mainīgie
	private int id;
	private ProfDegree degree;
	
	private static int idCounter = 0;
	
	//2.1 get funkcijas
	
	public ProfDegree getDegree() {
		return degree;
	}
		
	public int getId() {
		return id;
	}
	
	//2.2.set funkcijas
	
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
		super();//PErson() klases bezargumenta konstruktors
		setId();
		setDegree(ProfDegree.doctor);
	}
	//Professor prof1 = new Professor("Karina","Skirmante", ProfDegree.master);
	public Professor(String name, String surname, ProfDegree degree)
	{
		super(name, surname);//Person(name, surname) tiek izsaukts
		setId();
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
		//     id   (name + " " + surname) degree
		return id+" "+super.toString() + " " + degree;
	}
	
	public void display()
	{
		System.out.println(super.toString() + id*4/2);
	}
	
	
	
	
	
	

}
