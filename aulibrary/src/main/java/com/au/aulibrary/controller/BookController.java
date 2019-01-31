package com.au.aulibrary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.au.aulibrary.model.Book;
import com.au.aulibrary.model.Check;
import com.au.aulibrary.repository.BookDAO;

@RestController
public class BookController {
    @Autowired
    BookDAO bookDao;
    
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookDao.getAll();
	}
	
	@RequestMapping(value="/books/{ID}", produces="application/json")
	public Book getBookById(@PathVariable(value="ID") int bookID) {
		return bookDao.getRecordById(bookID);
	}
	
	@RequestMapping(value="/addbook",method = RequestMethod.POST,consumes="application/json")
	public Book create(@RequestBody Book book) {
		return bookDao.create(book);
	}
	
	@RequestMapping(value="/addcart",method=RequestMethod.POST,consumes="application/json")
	public void addToCart(@RequestBody Check check) {
		 bookDao.addCheckout(check.getId());
	}
	
	@RequestMapping(value="/getcart",produces="application/json")
	public List<Check> getToCart() {
		 return bookDao.checkout();
	}
		
}