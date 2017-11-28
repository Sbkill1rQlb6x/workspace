package action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import entity.Book;
import entity.Student;
import service.BookService;
import service.StudentService;

@Controller
public class BookAction {
	@Autowired
	private BookService bookService;

	
	
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	

	/*
	 * 查看图书列表
	 */
	@RequestMapping("/bookList.do")
	public ModelAndView bookList(){
		Map<String,Object> model = new HashMap<String,Object>();
		List<Book> books = bookService.getBooks();
		model.put("books",books);
		return new ModelAndView("bookList",model);
	}
	
	
}
