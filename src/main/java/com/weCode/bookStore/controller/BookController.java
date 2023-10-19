package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDTO>> getBooks(){
        BookDTO book = BookDTO.builder().title("First book").build();
        List<BookDTO> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);

    }
}
