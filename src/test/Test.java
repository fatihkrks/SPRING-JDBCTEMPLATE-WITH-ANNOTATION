package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import application.configuration.JdbcConfiguration;
import application.model.Student;
import application.repository.StudentRepository;

public class Test {
public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfiguration.class);
		StudentRepository studentRepo= context.getBean(StudentRepository.class);
		Student student=new Student("fatih", "karakas", "firat üni");
		studentRepo.save(student);
}
}
