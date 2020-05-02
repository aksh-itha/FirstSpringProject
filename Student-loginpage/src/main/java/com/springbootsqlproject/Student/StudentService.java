package com.springbootsqlproject.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents(){
		List<Student> students=new ArrayList<>();
		studentRepository.findAll()
		.forEach(students::add);
		return students;
		}
	public Optional<Student> getStudent(Integer id) {
		return studentRepository.findById(id);
	}
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	public void updateStudent(Integer id,Student student) {
		studentRepository.save(student);
	}
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
}
