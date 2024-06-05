package com.example.dockercompose.service;

import com.example.dockercompose.model.Book;
import com.example.dockercompose.repository.RepositoryL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceL {
    private final RepositoryL repositoryL;

    public void save(Book book) {
        repositoryL.save(book);
    }

    public void delete(int id) {
        repositoryL.deleteById(id);
    }

    public List<Book> findAll() {
        return repositoryL.findAll();
    }

    public void update(int id, Book book) {
        Book byId = repositoryL.findById(id).get();
        byId.setAuthor(book.getAuthor());
        byId.setCount(book.getCount());
        byId.setName(book.getName());
        repositoryL.save(byId);
    }
}
