package model;


import java.util.List;
import java.util.Map;

import util.DBUtil;

public class Goods {
	DBUtil db;
	
	public Goods() {
	
		super();
		db=new DBUtil();
	}

	public List<Map<String, String>> getCommFoods() {
		String sql="select * from goods where goods_type=4";
		return db.getList(sql);
	}

	public Map<String, String> getGoodDetail(String goods_id) {
		String sql="select * from goods join goods_type on goods.goods_type=goods_type.type_id where goods_id=?";
		
		return db.getMap(sql,new String[]{goods_id});
	}

	public List<Map<String, String>> getManClothes() {
		String sql="select * from goods where goods_type=1";
		return db.getList(sql);
	}

	public List<Map<String, String>> getWomanClothes() {
		String sql="select * from goods where goods_type=2";
		return db.getList(sql);
	}

	public List<Map<String, String>> getShoes() {
		String sql="select * from goods where goods_type=3";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeHot() {
		String sql="SELECT * FROM goods where goods_commend=2 order by RAND() limit 0,2";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeNew() {
		String sql="SELECT * FROM goods where goods_commend=3 order by RAND() limit 0,2";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeSale() {
		String sql="SELECT * FROM goods where goods_commend=4 order by RAND() limit 0,2";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeKill() {
		String sql="SELECT * FROM goods order by RAND() limit 0,6";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeManGod() {
		String sql="SELECT * FROM goods where goods_type=1 and goods_commend=1 order by RAND() limit 0,3";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeGodness() {
		String sql="SELECT * FROM goods where goods_type=2 and goods_commend=1 order by RAND() limit 0,3";
		return db.getList(sql) ;
	}

	public List<Map<String, String>> getHomeManShoes() {
		String sql="SELECT * FROM goods where goods_type=3 and goods_commend=1 order by RAND() limit 0,3";
		return db.getList(sql);
	}

	public List<Map<String, String>> getHomeWomanShoes() {
		String sql="SELECT * FROM goods where goods_id=42 or goods_id=48 or goods_id=39";
		return db.getList(sql);
	}

	public List<Map<String, String>> getSaleGoods() {
		String sql="SELECT * FROM goods where goods_commend=2";
		return db.getList(sql);
	}

	public List<Map<String, String>> getNewGoods() {
		String sql="SELECT * FROM goods where goods_commend=3";
		return db.getList(sql);
	}

	public List<Map<String, String>> getsortShoes(String sort) {
		String sql="SELECT * FROM goods where goods_type=?";
		return db.getList(sql,new String[]{sort});
	}

	public List<Map<String, String>> getappgoods() {
		String sql="SELECT * FROM goods limit 0,1";
		return db.getList(sql);
	}
	



	
}
