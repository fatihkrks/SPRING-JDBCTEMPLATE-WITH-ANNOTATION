package application.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import application.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		String name=rs.getString("name");
		String surname=rs.getString("surname");
		String school=rs.getString("school");
		Student student=new Student(name, surname, school);
		return student;
	}

}
