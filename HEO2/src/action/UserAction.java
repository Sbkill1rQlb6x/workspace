package action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.instrument.classloading.ShadowingClassLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;
import service.UserService;

@Controller
public class UserAction {

	@Autowired
	UserService userService;
	
	@RequestMapping("/index.do")
	public ModelAndView showIndex(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	@RequestMapping("/register.do")
	public ModelAndView showRegister(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	@RequestMapping("/addUser.do")
	public ModelAndView userSave(HttpServletRequest req){
        /*
         * 获取前台传来的数据并封装到对象中
         */
        User user = new User();
        user.setUserName(req.getParameter("userName"));
        user.setEmail(req.getParameter("email"));
       user.setPassword(req.getParameter("password"));
       System.out.println(req.getParameter("userName"));
       userService.addUser(user);
       return new ModelAndView();
    }
	
	@RequestMapping("/login.do")
	public String loginView(){
		return "login";
	}
	
	@RequestMapping("/loginRequest.do")
	public String loginRequset(HttpServletRequest req,Model model){
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		User login = userService.loginRequest(userName);
		if(login!=null)
		{
			if(login.getUserName().equals(userName)&&login.getPassword().equals(password))
			{
				return "home";
			}
			else {
				model.addAttribute("loginErr","用户名或密码错误！");
				return "login";
			}
		}
		else{
			model.addAttribute("loginErr","用户名或密码错误！");
			return "login";
		}
		
	}
}
