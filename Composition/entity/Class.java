package entity;

public class Class {
	private Integer room;
	private String course;
	private String time;
	private String attendance;
	private Teacher teacher;
	
	/*  
	 * Composition all the objects in Class will have a object
	 * of teacher already instantiated.
	 * The instantiation of the object has must to occor into the constructors
	*/
	
	public Class() {
		this.teacher = new Teacher();
	}

	public Class(Integer room, String course, String time, String attendance, Teacher teacher) {
		super();
		this.room = room;
		this.course = course;
		this.time = time;
		this.attendance = attendance;
		this.teacher = teacher;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public Teacher getTeacher() {
		return teacher;
	}

}
