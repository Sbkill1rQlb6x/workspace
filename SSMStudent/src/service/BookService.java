package service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.remoting.RemoteTimeoutException;
import org.springframework.stereotype.Service;

import entity.Book;
import entity.Student;
import mapper.BookMapper;

@Service
public class BookService {
	
	@Resource
	BookMapper bookMapper;
	
	
	
	public BookMapper getBookMapper() {
		return bookMapper;
	}

	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	public boolean addBook(Book book)
	{
		return bookMapper.add(book)==1;
	}
	
	public List<Book> findBooks()
	{
		return bookMapper.findBooks();
	}
	
	public int deleteBook(String isbn){
		System.out.println(isbn);
		return bookMapper.deleteBook(isbn);
	}
	public Book findBookById(String isbn)
	{
		return bookMapper.findBookById(isbn);
	}
	public boolean updateBook(Book book)
	{
		return bookMapper.updateBook(book)==1;
	}
}
