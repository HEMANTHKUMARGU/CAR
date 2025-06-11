package com.example.SpringJdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/students")
public class StudentControler {

	private static final Logger logger = LogManager.getLogger(StudentControler.class);

	@Autowired
	StudentRepository repo;
	@Autowired
	private EmailRepository emailRepository;

	@GetMapping
	public List<StudentClass> getAllStudents() {
		logger.info("fetching all students");

		List<StudentClass> students = repo.findAll();
		logger.debug("Retrieved {} students", students.size());
		return students;
	}

	@GetMapping("/{id}")
	public StudentClass getStudent(@PathVariable int id) {

		logger.info("fetching student with id", id);
		Optional<StudentClass> student = repo.findById(id);
		if (student.isPresent()) {
			logger.debug("Student found: {}", student.get());
			return student.get();
		} else {
			logger.warn("student with ID not found", id);
			throw new IdNotFoundException("Student ID is not Present");
		}

	}

	@GetMapping("/withparam")
	public ResponseEntity<?> getStudentWithParam(@RequestParam MultiValueMap<String, Integer> IDS) {
		Iterable<Integer> ids = (Iterable<Integer>) IDS.get("id");

		List<StudentClass> students = repo.findAllById(ids);

		return new ResponseEntity<>(students, HttpStatus.FOUND);
	}

	@PostMapping("/addemail")
	public ResponseEntity<?> addStudent(@RequestBody StudentClass student) {

		Email email = emailRepository.findById(student.getEmail().getId())
				.orElseThrow(() -> new RuntimeException("Email ID not found"));

		student.setEmail(email);

		StudentClass saved = repo.save(student);
		return ResponseEntity.ok(saved);

	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public StudentClass createStudent(@RequestBody StudentClass student) {
		if (student.getName().isEmpty()) {
			logger.warn("Mandatory filed missing in:{}", student);
			throw new MandatoryFieldException("Mandatory Field is missing");
		}
		student = repo.save(student);
		return student;
	}

	@PutMapping("/update/{id}")
	public StudentClass updateStudent(@PathVariable int id) {
		StudentClass student = repo.findById(id).get();
		student.setName("gowtham");
		student = repo.save(student);
		return student;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
		return "deleted";
	}

}
