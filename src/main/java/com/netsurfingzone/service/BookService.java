package com.netsurfingzone.service;

import com.netsurfingzone.entity.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookService {
    public Book findByBookId(int bookId);

    public Book saveBook(Book book);
}