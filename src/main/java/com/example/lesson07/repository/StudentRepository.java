package com.example.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
	
	// ex02/2
	//@Query(value = "select * from `new_student` where `dreamJob` = :dreamJob", nativeQuery = true) // native query(DB에 직접 조회)
	
	// ex02/2-2 JPQL(엔티티 조회) - query 아님
	@Query(value = "select s from StudentEntity s where s.dreamJob = :dreamJob")
	public List<StudentEntity> findByDreamJob(@Param("dreamJob") String dreamJob);
}
