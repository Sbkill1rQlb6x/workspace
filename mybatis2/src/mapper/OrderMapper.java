package mapper;

import java.util.List;

import pojo.Order;

public interface OrderMapper {
	
	//查询订单表order的所有数据（但是order里面的userid和数据库里面的不一致）
	 public List<Order> selectOrdersList();
}
