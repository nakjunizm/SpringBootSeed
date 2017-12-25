package com.github.nakjunizm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.nakjunizm.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByName(String name);
	
//	@Query("SELECT u FROM user u WHERE u.name LIKE CONCAT('%',:name,'%')")
//	List<User> findUserWithPartialName(@Param("name") String name);
	
}
