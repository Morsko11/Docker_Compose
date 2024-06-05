package com.example.dockercompose.repository;

import com.example.dockercompose.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryL extends JpaRepository<Book,Integer> {

}
