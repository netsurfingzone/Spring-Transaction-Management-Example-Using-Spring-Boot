package com.netsurfingzone.repository;

import com.netsurfingzone.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BookRepository extends CrudRepository<Book, Serializable> {
    public Book findByBookId(int bookId);

}