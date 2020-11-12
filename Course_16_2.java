package OOP;

public class Course_16_2 {
//	Създайте и тествайте
//	класа Course, следвайки
//	диаграмата. Един курс може 
//	да се посещава от максимум стотима ученици.
	private String courseName;
	private String students[];
	private int numberOfStudents;
	
	public Course_16_2(String courseName){
		this.courseName = courseName;
		students = new String[100];
		numberOfStudents = 0;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents < 100) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
	}
	
	public void dropStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(student.equals(students[i])) {
				for(int j = i; j <  numberOfStudents - 1; j++) {
					students[j] = students [j+1];
				}
				numberOfStudents--;
				students[numberOfStudents] = null;
				break;
			}
		}
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void print() {
		System.out.println(this.getNumberOfStudents() + " students in total in "+ this.getCourseName());
		
		for(int i = 0; i < this.getNumberOfStudents(); i++) {
			System.out.println("students [" + i + "] is " + this.getStudents()[i]);
		}
	}
}
