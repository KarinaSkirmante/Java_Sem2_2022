package service;

import models.Course;
import models.Grade;
import models.ProfDegree;
import models.Professor;
import models.Student;

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
		
		Student stud1 = new Student("Jānis", "Bērziņš");
		Student stud2 = new Student("Līga", "Jaukā");
		Student stud3 = new Student("Baiba", "Nejaukā");
		System.out.println(stud1);
		System.out.println(stud2);
		System.out.println(stud3);
		
		Grade g1 = new Grade(10, stud1, c1);//10 Jānis JAVA
		Grade g2 = new Grade(3, stud1, c2);//3 Jānis OOP
		Grade g3 = new Grade(5, stud1, c3);//5 Jānis Matemātika
		Grade g4 = new Grade(7, stud2, c1);//7 Līga JAVA
		Grade g5 = new Grade(2, stud2, c3);//2 Līga Matemātika
		Grade g6 = new Grade(9, stud3, c2);//9 Baiba OOP
		Grade g7 = new Grade(10, stud3, c3);//10 Baiba Matemātika
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g5);

	}

}
