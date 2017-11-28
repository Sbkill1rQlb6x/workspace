package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.OrderMapper;
import pojo.Order;

public class OrderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource="SqlMapConfig.xml";
		InputStream in=Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper mapper=sqlSession.getMapper(OrderMapper.class);
		
		//查询所有订单
		List<Order> orderList=mapper.selectOrdersList();
		for(Order o:orderList)
		{
			System.out.println(o);
		}
	}

}
