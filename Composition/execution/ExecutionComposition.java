package execution;
import entity.Class;
import entity.Teacher;
public class ExecutionComposition {
	public static void main(String[] args) {
		Class c1 = new Class();
		c1.setRoom(311);
		c1.setCourse("Java");
		c1.setAttendance("Every Monday");
		c1.setTime("1 PM until 6 PM");
		c1.getTeacher().setIdTeacher(322);
		c1.getTeacher().setName("David");
		c1.getTeacher().setEmail("david@javaschool.com");
		
		System.out.println("Class: "+c1.getCourse()+", room: "+c1.getRoom());
		System.out.println("Teacher:"+c1.getTeacher().getName()+", email: "+c1.getTeacher().getEmail());
		
	}
}
