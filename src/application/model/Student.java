package application.model;

public class Student {
	
	
	private int id;
	private String name;
	private String surname;
	private String school;

	public Student() {
		super();
	}

	public Student(String name, String surname, String school) {
		super();
		this.name = name;
		this.surname = surname;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", school=" + school + "]";
	}

}
