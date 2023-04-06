package com.manage.library.business.concretes;

import com.manage.library.business.abstracts.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookManager implements BookService {

    @Override
    public String getBook() {
        String bookOne = "Pride and Justice";
        return bookOne;
    }
}
