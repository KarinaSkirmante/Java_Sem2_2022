package models;

// Viļa komentārs, lai notestētu git versiju kontroli
public class Grade {
	//1.mainīgie
	private int id;
	private int gradeValue;
	private Student student;
	private Course course;
	
	private static int idCounter = 100000;
	//2.1.get funkcijas

	public int getId() {
		return id;
	}

	public int getGradeValue() {
		return gradeValue;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	//2.2.set funkcijas
	public void setId() {
		this.id = idCounter++;
	}

	public void setGradeValue(int gradeValue) {
		if(gradeValue>0 && gradeValue<=10)
		{
			this.gradeValue = gradeValue;
		}
		else
		{
			this.gradeValue = 0;
		}
	}

	public void setStudent(Student student) {
		if(student!=null)
		{
			this.student = student;
		}
		else
		{
			this.student = new Student();
		}
	}

	public void setCourse(Course course) {
		if(course!=null)
		{
			this.course = course;
		}
		else
		{
			this.course = new Course();
		}
	}
	// Kristians Git Test 
		
	//3.konstruktori
	public Grade()
	{
		setId();
		setGradeValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	public Grade(int gradeValue, Student student, Course course)
	{
		setId();
		setGradeValue(gradeValue);
		setStudent(student);
		setCourse(course);
	}

	//4.toString
	
	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeValue=" + gradeValue + ", student=" + student.getSurname() + ", course=" + course.getTitle() + "]";
	}
	
	
	
	

}
