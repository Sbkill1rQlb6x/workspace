package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Book;
import entity.Student;



@Service
public class BookService {
	private static List<Book> books;
	static{
		books = new ArrayList<Book>();
		Book b1=new Book();
		b1.setIsbn("22222");
		b1.setName("Java");
		b1.setAuthor("zhangsan");
		b1.setPrice("33");
		books.add(b1);
		
		Book b2=new Book();
		b2.setIsbn("33333");
		b2.setName("Java EE");
		b2.setAuthor("zhangsan");
		b2.setPrice("44");
		books.add(b2);
	}
	
	/*
	 * 获取学生信息
	 */
	public List<Book> getBooks() {
		return books;
	}
	
	/*
	 * 添加学生
	 */
	public boolean addBook(Book book){
		if(books==null)
			return false;
		for(int i=0;i<books.size();i++){
			if(books.get(i).getIsbn().equals(books.get(i).getIsbn())){
				return false;
			}
		}
		books.add(book);
		return true;
	}
	
	public Book findById(String isbn){
		for(int i=0;i<books.size();i++){
			if(books.get(i).getIsbn().equals(isbn)){
				return books.get(i);
			}
		}
		return null;
	}
	
//	public boolean updateBook(Book book){
//		if(book==null)
//			return false;
//		for(int i=0;i<books.size();i++){
//			if(books.get(i).getId().equals(books.getId())){
//				students.set(i, student);
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public boolean delete(String id){
//		for(int i=0;i<students.size();i++){
//			if(students.get(i).getId().equals(id)){
//				students.remove(i);
//				return true;
//			}
//		}
//		return false;
//	}
}
