package mapper;

import java.util.List;

import entity.Book;

public interface BookMapper {
	public int add(Book book);
	public List<Book> findBooks();
	public int deleteBook(String isbn);
	public Book findBookById(String isbn);
	public int updateBook(Book book);
}
