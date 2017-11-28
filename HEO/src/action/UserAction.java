package action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import entity.User;
import service.UserService;

@Controller
public class UserAction {
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("register.do")
	public ModelAndView addView(){
		return new ModelAndView("register");		
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
	       userService.add(user);
	       return new ModelAndView();
	    }

}
