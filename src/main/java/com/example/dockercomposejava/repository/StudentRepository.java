package com.example.dockercomposejava.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.dockercomposejava.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

	Student findByRollno(int rollno);

	
}
