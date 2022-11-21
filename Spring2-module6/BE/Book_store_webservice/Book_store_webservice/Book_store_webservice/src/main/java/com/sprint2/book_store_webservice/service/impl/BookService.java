package com.sprint2.book_store_webservice.service.impl;

import com.sprint2.book_store_webservice.dto.IBookDto;
import com.sprint2.book_store_webservice.model.Book;
import com.sprint2.book_store_webservice.repository.IBookRepository;
import com.sprint2.book_store_webservice.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public Page<IBookDto> findAllBookAndSearch(String title, String author , Pageable pageable) {
        return this.iBookRepository.findAllBookAndSearch(
                "%" + title + "%",
                "%" + author + "%",
                pageable
        );
    }

    @Override
    @Transactional
    public Book findByIdBook(Long id) {
        return this.iBookRepository.findByIdBook(id);
    }



}
