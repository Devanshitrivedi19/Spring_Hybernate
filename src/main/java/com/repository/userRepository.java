package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.entity.UserEntity;

@Repository
public interface userRepository extends JpaRepository<UserEntity,Integer>{
	
	//insert 
	//update
	//delete
	//sort
}
