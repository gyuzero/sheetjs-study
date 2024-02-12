package com.example.sheetjsstudy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<Book>> books() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setTitle("이것이 취업을 위한 백엔드 개발이다 with 자바");
        book1.setAuthor("이준형");
        book1.setPrice(32400);

        books.add(book1);

        Book book2 = new Book();
        book2.setTitle("이것이 취업을 위한 코딩 테스트다 with 파이썬");
        book2.setAuthor("나동빈");
        book2.setPrice(30600);

        books.add(book2);

        return ResponseEntity.status(HttpStatus.OK).body(books);
    }

}
