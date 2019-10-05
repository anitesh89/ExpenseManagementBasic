package io.practice.expensemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.practice.expensemanagement.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	Category findByName(String name);

}
