package action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Lost;
import service.LostService;

@Controller
public class LostAction {

	@Autowired
	LostService lostService;

	public LostService getLostService() {
		return lostService;
	}

	public void setLostService(LostService lostService) {
		this.lostService = lostService;
	}
	
	@RequestMapping("/lost.do")
	public String lost(Model model){
		List<Lost> findLostInfo = lostService.findLostInfo();
		for(Lost l:findLostInfo)
		{
			System.out.println(l);
		}
		model.addAttribute("lostInfo", findLostInfo);
		return "lostInfo";
	}
	
}
