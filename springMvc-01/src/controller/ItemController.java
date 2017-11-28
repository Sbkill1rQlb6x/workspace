package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * 商品管理
 * */
@Controller
public class ItemController {

	//入门程序
	//跳转视图
	@RequestMapping(value="/item/itemlist.action")
	public ModelAndView itemList()
	{
		ModelAndView mav =new ModelAndView();
		mav.setViewName("itemList");
		return mav;
	}
}
