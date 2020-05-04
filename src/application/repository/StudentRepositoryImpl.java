package application.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import application.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
private final static String INSERT="insert into student(name,surname,school) values (?,?,?)";
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void save(Student student) {
		Object[] insertParams=new Object[] {student.getName(),student.getSurname(),student.getSchool()};
		jdbcTemplateObject.update(INSERT, insertParams);
		System.out.println("person inserted " + student);
			
	}

}
