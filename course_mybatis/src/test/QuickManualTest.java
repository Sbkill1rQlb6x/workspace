package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import MapperInterface.QuickManualMapper;
import pojo.QuickManual;

public class QuickManualTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
	    SqlSessionFactory sqlSessionFactory = new	SqlSessionFactoryBuilder().build(in);
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    QuickManualMapper mapper=sqlSession.getMapper(QuickManualMapper.class);
	    QuickManual quickManual = mapper.findById("2");
	    System.out.println(quickManual);
	    
	    List<QuickManual> all = mapper.findAll();
	    for(QuickManual q:all)
	    {
	    	System.out.println(q);
	    }
	    
	    
	    
	    //删除
	    mapper.deleteById("3");
	    sqlSession.commit();
	    sqlSession.close();
	    
	}

}
