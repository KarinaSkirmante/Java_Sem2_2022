package service;

import java.util.ArrayList;

import models.Course;
import models.Grade;
import models.ProfDegree;
import models.Professor;
import models.Student;

public class VeAForumService {

	private static ArrayList<Professor> allProfessors = new ArrayList<>();
	private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Karina", "Šķirmante", ProfDegree.master);
		Professor prof2 = new Professor("Estere", "Vītola", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		allProfessors.add(prof1);
		allProfessors.add(prof2);
		allProfessors.add(prof3);
		for (Professor temp : allProfessors) {
			System.out.println(temp);
		}
		
		
		
		
		Course c1 = new Course("Programmešana tīmeklī JAVA", (byte)4, prof1);
		Course c2 = new Course("Objektoerientēta programmešana", (byte)4, prof2);
		Course c3 = new Course("Matemātika", (byte)6, prof3);
		allCourses.add(c1);
		allCourses.add(c2);
		allCourses.add(c3);
		for (Course temp : allCourses) {
			System.out.println(temp);
		}
		
		Student stud1 = new Student("Jānis", "Bērziņš");
		Student stud2 = new Student("Līga", "Jaukā");
		Student stud3 = new Student("Baiba", "Nejaukā");
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		for (Student temp : allStudents) {
			System.out.println(temp);
		}
		
		Grade g1 = new Grade(10, stud1, c1);//10 Jānis JAVA
		Grade g2 = new Grade(3, stud1, c2);//3 Jānis OOP
		Grade g3 = new Grade(5, stud1, c3);//5 Jānis Matemātika
		Grade g4 = new Grade(7, stud2, c1);//7 Līga JAVA
		Grade g5 = new Grade(2, stud2, c3);//2 Līga Matemātika
		Grade g6 = new Grade(9, stud3, c2);//9 Baiba OOP
		Grade g7 = new Grade(10, stud3, c3);//10 Baiba Matemātika
		allGrades.add(g1);
		allGrades.add(g2);
		allGrades.add(g3);
		allGrades.add(g4);
		allGrades.add(g5);
		allGrades.add(g6);
		allGrades.add(g7);
		
		for (Grade temp : allGrades) {
			System.out.println(temp);
		}
		
	}

}
