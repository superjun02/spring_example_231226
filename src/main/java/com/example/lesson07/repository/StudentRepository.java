package com.example.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lesson07.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	// ex02/select JPQL
	public List<StudentEntity> findAllByOrderByIdDesc();

	public List<StudentEntity> findTop3ByOrderByIdDesc();

	public List<StudentEntity> findByName(String name);

	public List<StudentEntity> findByNameIn(List<String> nameIn);

	public List<StudentEntity> findByNameAndDreamJob(String name, String dreamJob);

	public List<StudentEntity> findByEmailContains(String keyword);

	public List<StudentEntity> findByNameStartingWith(String keyword);

	public List<StudentEntity> findByIdBetween(int startId, int endId);
}
