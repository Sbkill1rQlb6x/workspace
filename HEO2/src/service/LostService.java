package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.LostMapper;
import pojo.Lost;

@Service
public class LostService {

	@Resource
	LostMapper lostMapper;

	public LostMapper getLostMapper() {
		return lostMapper;
	}

	public void setLostMapper(LostMapper lostMapper) {
		this.lostMapper = lostMapper;
	}
	
	public List<Lost> findLostInfo(){
//		SimpleDateFormat change=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat change2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 List<Lost> findLostInfo = lostMapper.findLostInfo();
//		 for(int i=0;i<findLostInfo.size();i++)
//		 {
//			 
//			    
//			    String newDate=change.format(findLostInfo.get(i).getLost_Date());
//			    try {
//					Date newDate2=change2.parse(newDate);
//					System.out.println("sasasasa"+newDate2.toString());
//					findLostInfo.get(i).setLost_Date(newDate2);
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println(findLostInfo.get(i).getLost_Date());
//			
//		 }
		
		return findLostInfo;
	}
}
