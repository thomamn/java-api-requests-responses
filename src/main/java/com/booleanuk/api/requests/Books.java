package com.booleanuk.api.requests;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/books")
public class Books {


    private List<Book> books = new ArrayList<>(){{
        add(new Book("A Game of Thrones", 780, "George R.R Martin", "Fantasy"));
        add(new Book("The Well of Ascension", 781, "Brandon Sanderson", "Fantasy"));

    }};


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book){
        books.add(book);
        return book;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks(){
        return books;

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBook(@RequestBody Book book, @PathVariable int id){

        return(books.get(id));

    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Book changeBook(@RequestBody Book book, @PathVariable int id){

        for (Book b: books){
            if (Objects.equals(b.getNumPages(), id)){
                b.setTitle(book.getTitle());
                return b;
            }
        }


        return null;

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book deleteBook(@RequestBody Book book, @PathVariable int id){

        for (Book b: books){
            if (Objects.equals(b.getNumPages(), id)){
                books.remove(b);
                return b;
            }
        }


        return null;

    }
}
