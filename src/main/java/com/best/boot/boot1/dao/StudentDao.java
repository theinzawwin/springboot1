package com.best.boot.boot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.best.boot.boot1.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
	
}
