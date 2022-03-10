package service;

import models.Course;
import models.ProfDegree;
import models.Professor;

public class VeAForumService {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Karina", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		
		System.out.println(prof1);
		System.out.println(prof2);
		System.out.println(prof3);
		
		
		Course c1 = new Course("Programmešana tīmeklī JAVA", (byte)4, prof1);
		Course c2 = new Course("Objektoerientēta programmešana", (byte)4, prof2);
		Course c3 = new Course("Matemātika", (byte)6, prof3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

	}

}
