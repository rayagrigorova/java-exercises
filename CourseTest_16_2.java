package OOP;

public class CourseTest_16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course_16_2 someCourse = new Course_16_2("Some course name");
		
		someCourse.addStudent("Ivan");
		someCourse.addStudent("Mira");
		someCourse.addStudent("Gergana");
		someCourse.addStudent("Stoyan");
		someCourse.addStudent("Stanislav");
		
		someCourse.print();
	
		someCourse.dropStudent("Gergana");
		someCourse.print();
		
		someCourse.dropStudent("Stoyan");
		someCourse.dropStudent("Aleksandra");
		someCourse.dropStudent("Stanislav");
		someCourse.print();
		
	}

}
