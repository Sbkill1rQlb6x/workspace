package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Book;
import service.BookService;

@Controller
public class BookAction {
	@Autowired
	private BookService bookService;
	
	
	@RequestMapping("/bookAddView.do")
	public String bookAddView()
	{
		return "bookAdd";
	}
	
	@RequestMapping("/bookAdd.do")
	public String bookAdd(Book book,Model model)//book接受值,MODEL向界面穿值
	{
		if (bookService.addBook(book)) {
			model.addAttribute("info", "添加成功!");
		}
		else {
			model.addAttribute("info", "添加失败!");
		}
		return "bookAdd";
	}
	
	@RequestMapping("/bookList.do")
	public String bookList(Model model)
	{
		List<Book> books = bookService.findBooks();
		for(Book b:books)
		{
			System.out.println(b);
		}
		model.addAttribute("books",books);
		return "bookList";
	}
	
	@RequestMapping("/deleteBook.do")
	public String deleteBook(Model model){
		List<Book> books = bookService.findBooks();
		model.addAttribute("books",books);
		return "bookDelete";
	}
	
	@RequestMapping("/bookDeletes.do")
	public String deleteBooks(HttpServletRequest req,Model model)
	{
		String isbn =req.getParameter("isbn");
		System.out.println(isbn);
		if (bookService.deleteBook(isbn)==1) {
			model.addAttribute("info", "删除成功!");
		}
		else{
			model.addAttribute("info", "删除失败!");
		}
		return "forward:deleteBook.do";
	}
	
	@RequestMapping("/bookUpdateView.do")
	public String bookUpdateView (Model model)
	{
		List<Book> books = bookService.findBooks();
		model.addAttribute("books",books);
		return "bookUpdateView";
	}
	@RequestMapping("/bookUpdateView2.do")
	public String bookUpdateView2 (HttpServletRequest req,Model model)
	{
		String isbn =req.getParameter("isbn");
		Book book = bookService.findBookById(isbn);
		model.addAttribute("books", book);
		return "bookUpdate";
	}
	@RequestMapping("/bookUpdateInfo.do")
	public String bookUpdateInfo(HttpServletRequest req,Model model)
	{
		String isbn =req.getParameter("isbn");
		Book book =new Book();
		book.setName(req.getParameter("name"));
		book.setAuthor(req.getParameter("author"));
		book.setPrice(Float.parseFloat(req.getParameter("price")));
		book.setIsbn(isbn);
		System.out.println(book);
		if(bookService.updateBook(book))
		{
			model.addAttribute("info", "修改成功!");
		}
		else{
			model.addAttribute("info", "修改失败!");
		}
		return "forward:bookUpdateView2.do";
	}
}
