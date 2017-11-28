package ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.HomesUserDatabase;
import org.apache.http.util.EntityUtils;

import Sms.SendCode;
import model.Goods;
import model.Shopcar;
import model.User;





@WebServlet("*.action")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getServletPath();
		url=url.substring(url.lastIndexOf('/')+1,url.indexOf(".action"));
		String sort=req.getParameter("sort");
		Goods goods=new Goods();
		User user=new User();
		Shopcar shopcar=new Shopcar();
		SendCode sendCode;
		if(url.equals("index")){	
			System.out.print("index");
			List<Map<String,String>> commfoods=goods.getCommFoods();
			req.setAttribute("commfoods", commfoods);
			
			List<Map<String,String>> manclothes=goods.getManClothes();
			req.setAttribute("manclothes", manclothes);
			
			List<Map<String,String>> womanclothes=goods.getWomanClothes();
			req.setAttribute("womanclothes", womanclothes);
			
			List<Map<String,String>> shoes=goods.getShoes();
			req.setAttribute("shoes", shoes);
			
			//首页热销
			List<Map<String,String>> homehot=goods.getHomeHot();
			req.setAttribute("homehot", homehot);
			
			//首页新到
			List<Map<String,String>> homenew=goods.getHomeNew();
			req.setAttribute("homenew", homenew);
			
			//首页特价
			List<Map<String,String>> homesale=goods.getHomeSale();
			req.setAttribute("homesale", homesale);
			
			//秒杀
			List<Map<String,String>> homekill=goods.getHomeKill();
			req.setAttribute("homekill", homekill);
			
			//爱男神
			List<Map<String,String>> homemangod=goods.getHomeManGod();
			req.setAttribute("homemangod", homemangod);
			
			//爱女神
			List<Map<String,String>> homegodness=goods.getHomeGodness();
			req.setAttribute("homegodness", homegodness);
			
			//男鞋
			List<Map<String,String>> homemanshoes=goods.getHomeManShoes();
			req.setAttribute("homemanshoes", homemanshoes);
			
			//女鞋
			List<Map<String,String>> homewomanshoes=goods.getHomeWomanShoes();
			req.setAttribute("homewomanshoes", homewomanshoes);
			
		    req.getRequestDispatcher("/home.jsp").forward(req, resp);		    
		}
		else if(url.equals("goods_detail"))
		{
			String goods_id=req.getParameter("goods_id");
			System.out.print("id"+goods_id);
			Map<String,String> gd=goods.getGoodDetail(goods_id);
			System.out.print("gd="+gd);
			req.setAttribute("gd",gd);
			req.getRequestDispatcher("/goods/goods_detail.jsp").forward(req, resp);
		}
		else if(url.equals("register"))
		{
			System.out.print("123");
			String user_name=req.getParameter("user_name");
			System.out.print(user_name);
			String user_email=req.getParameter("user_email");
			String user_phone=req.getParameter("phone");
			String user_pw=req.getParameter("password");
			Map<String,String> user_register=new HashMap<>();
			user_register.put("user_name", user_name);
			user_register.put("user_email", user_email);
			user_register.put("user_phone", user_phone);
			user_register.put("user_pw", user_pw);
			int row=user.createNewUser(user_register);
			req.getRequestDispatcher("index.action").forward(req, resp);
		}
		else if(url.equals("login")){
			String userName=req.getParameter("login_user_name");
			String userPw=req.getParameter("login_password");
			Map<String, String> loginResult = user.login(userName, userPw);
			HttpSession session = req.getSession();
			if(loginResult!=null)
			{
				session.setAttribute("loginID", loginResult.get("user_id"));
				session.setAttribute("loginName", loginResult.get("user_name"));
				req.getRequestDispatcher("index.action").forward(req, resp);
			}
			else{
				req.setAttribute("msg", "您输入的用户名或密码错误!");
				req.setAttribute("href", "login.jsp");
				req.getRequestDispatcher("/result.jsp").forward(req, resp);
			}
		}
		else if(url.equals("sale_goods"))
		{
			List<Map<String,String>> sale_goods=goods.getSaleGoods();
			req.setAttribute("sale_goods", sale_goods);
			req.getRequestDispatcher("/goods/sale_goods.jsp").forward(req, resp);
		}
		else if(url.equals("new_goods"))
		{
			List<Map<String,String>> new_goods=goods.getNewGoods();
			req.setAttribute("new_goods", new_goods);
			req.getRequestDispatcher("/goods/new_goods.jsp").forward(req, resp);
		}
		else if(url.equals("goods_sort"))
		{
			List<Map<String,String>> sortShoes=goods.getsortShoes(sort);
			req.setAttribute("sortShoes", sortShoes);
			req.getRequestDispatcher("/goods/goods_list.jsp").forward(req, resp);
		}
		else if(url.equals("goods_list"))
		{
			sort=req.getParameter("listType");
			List<Map<String,String>> sortShoes=goods.getsortShoes(sort);
			req.setAttribute("sortShoes", sortShoes);
			req.getRequestDispatcher("/goods/goods_list.jsp").forward(req, resp);
		}
		else if(url.equals("joinShopCar"))
		{
			HttpSession session = req.getSession();
			String userName=(String)session.getAttribute("loginName");
			String goodsId=req.getParameter("goodsId");
			if(userName!=null)
			{
				Map<String,String> shopCar=new HashMap<>();
				shopCar.put("userName", userName);
				shopCar.put("goodsId", goodsId);
				int row=shopcar.createShopCar(shopCar);
			}
			req.getRequestDispatcher("goods_detail.action?goods_id="+goodsId).forward(req, resp);
		}
		else if(url.equals("shopcar"))
		{
			HttpSession session = req.getSession();
			String userName=(String)session.getAttribute("loginName");
			List<Map<String,String>> shopCarGoods=shopcar.getshopCarGood(userName);
			System.out.print("111111111111111111111111");
			System.out.print(shopCarGoods);
			req.setAttribute("shopCarGoods", shopCarGoods);
			req.getRequestDispatcher("/shopcar/shopcar.jsp").forward(req, resp);
		}
		else if(url.equals("applogin"))
		{
			resp.setContentType("text/json; charset=utf-8");
			PrintWriter out = resp.getWriter();
			String username=req.getParameter("userName");
			String password=req.getParameter("userPass");
			Map<String, String> appLoginResult = user.appLogin(username, password);
			if(appLoginResult!=null){
				req.getSession().setAttribute("_LOGIN_USER_",appLoginResult);
				out.print("{\"login\":true,\"username\":\""+username+"\"}");
			}else{
				out.print("{\"login\":false,\"msg\":\"用户名或密码错误\"}");
			}
			out.flush();
		}
		
		else if(url.equals("getappgoods"))
		{
			resp.setContentType("text/json; charset=utf-8");
			List<Map<String,String>> getappgoods=goods.getappgoods();
			PrintWriter out = resp.getWriter();
			out.print("{\"appgoods\":[");
			for(int i=0;i<=getappgoods.size();i++)
			{
				for(Map<String,String> g:getappgoods)
				{
					out.print("{\"goodsName\":"+"\""+g.get("goods_name")+"\","+"\"goods_price\":"+"\""+g.get("goods_sale_price")+"\"");
				}
			}
			out.print("}]}");
		}
		else if(url.equals("yanzhengma"))
		{
			String phonenumber=req.getParameter("phonenumber");
			 System.out.println(phonenumber);
			SendCode send=new SendCode(phonenumber);
			try {
				send.sendSms();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
