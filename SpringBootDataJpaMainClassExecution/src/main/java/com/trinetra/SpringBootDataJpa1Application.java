package com.trinetra;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.trinetra.entity.Student;
import com.trinetra.repository.StudentRepository;

@SpringBootApplication
public class SpringBootDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpa1Application.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		System.out.println(studentRepository.getClass().getName());

		
		     //Saving Student 
		   Student student = new Student();
		  
		  student.setStudentId(104); 
		  student.setStudentName("rajesh");
		  student.setStudentAge(28); 
		  student.setStudentEmail("dedf@gmail.com");
		  
		  studentRepository.save(student);
		 

		/*
		 * // Find By ID Optional<Student> findById = studentRepository.findById(100);
		 * 
		 * if(findById.isPresent()) { System.out.println(findById.get()); }
		 */

		// to retreive all the Records
//		List<Student> findAll = studentRepository.findAll();
//		findAll.forEach(s -> {
//			System.out.println(s);
//		});
		  
		  
		  // find record by selection by id
		 List<Student> findAllById = studentRepository.findAllById(Arrays.asList(100,104));

		 findAllById.forEach(s->{
			 System.out.println(s);
		 });
		 
		context.close();
	}

}
