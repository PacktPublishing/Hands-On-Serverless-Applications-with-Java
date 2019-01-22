package com.packtpub.springfunctions.boundaries;

import com.packtpub.springfunctions.domain.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookResource {

    private static List<Book> books = new ArrayList<>();


    @GetMapping(path = "/books")
    public ResponseEntity<List<Book>> find() {
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping(path = "/books")
    public ResponseEntity<Book> save(@RequestBody Book book) {
        books.add(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
