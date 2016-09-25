package entity;

public class Teacher {
	private Integer idTeacher;
	private String name;
	private String email;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer idTeacher, String nome, String email) {
		super();
		this.idTeacher = idTeacher;
		this.name = nome;
		this.email = email;
	}

	//Encapsulation
	
	public Integer getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Integer idTeacher) {
		if (idTeacher > 0){
			this.idTeacher = idTeacher;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
