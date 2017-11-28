package model;

import java.util.List;
import java.util.Map;

import util.DBUtil;

public class Shopcar {
	DBUtil db;
	
 public Shopcar(){
	 super();
	 db=new DBUtil();
 }

public int createShopCar(Map<String, String> shopCar) {
	String sql = "INSERT INTO shopcar (userName,goodsId) VALUES (?,?)";
	return db.update(sql, new String[]{shopCar.get("userName"),shopCar.get("goodsId")});
}

public List<Map<String, String>> getshopCarGood(String userName) {
	String sql = "select * from shopcar join goods on shopcar.goodsId=goods.goods_id where userName=? ";
	return db.getList(sql,new String[]{userName});
}
 
}
