package com.netsurfingzone.serviceimpl;

import com.netsurfingzone.entity.Book;
import com.netsurfingzone.repository.BookRepository;
import com.netsurfingzone.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findByBookId(int bookId) {
        Book book = bookRepository.findByBookId(bookId);
        return book;
    }

    @Transactional
    public Book saveBook(Book book) {
        Book book1 = bookRepository.save(book);
        return book1;

  /*      Book book1 = bookRepository.save(book);
        int a = 10/0;
        System.out.println(a);
        return book1;*/
    }
}