package com.example.test.repository;

import com.example.test.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
