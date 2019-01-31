package com.au.aulibrary.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.aulibrary.model.Book;
import com.au.aulibrary.model.Check;

@Repository
public class BookDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getAll(){
		return jdbcTemplate.query("SELECT * FROM Book", (rs,i)->{
			return new Book(rs.getInt("id"),rs.getString("bookname"),rs.getString("authorname"),rs.getDouble("price"),rs.getString("bookdescription"));
		});
	}
	
	public Book getRecordById(int id){
		List<Book> books =  jdbcTemplate.query("select * from Book where id="+ id, (rs,i)->{
			return new Book(rs.getInt("id"),rs.getString("bookname"),rs.getString("authorname"),rs.getDouble("price"),rs.getString("bookdescription"));
		});
		return books.get(0);
	}
	
	public Book create(Book book) {
		jdbcTemplate.update("insert into Book(price,bookName,authorName,id,descriptions) values(?,?,?,?,?)",
				book.getPrice(),
				book.getName(),
				book.getAuthorName(),
				book.getId(),
				book.getDescription());
		return book;
	}
	
	public void addCheckout(int id){

		List<Book> books =  jdbcTemplate.query("select * from Book where id="+ id, (rs,i)->{
			return new Book(rs.getInt("id"),rs.getString("bookname"),rs.getString("authorname"),rs.getDouble("price"),rs.getString("bookdescription"));
		});
		jdbcTemplate.update("insert into checkout values("+ id +",'" +books.get(0).getName() + "')");
		
	}
	
	public List<Check> checkout(){
		List<Check> checkoutList =  jdbcTemplate.query("select * from checkout ", (rs,i)->{
			return new Check(rs.getInt(1),rs.getString(2));
});
		return checkoutList;
	}
	
	
	
	
	
	
}