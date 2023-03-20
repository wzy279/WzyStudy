package com.soft.Test1.service.Impl;

import com.soft.Test1.domain.Book;
import com.soft.Test1.mapper.BookMapper;
import com.soft.Test1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public Book getbook() {
//        List<Book> books = new ArrayList<>();
        bookMapper.selectOne(null);
        return null;
    }
}
