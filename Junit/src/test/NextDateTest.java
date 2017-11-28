package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.NextDate;

public class NextDateTest {
	private static NextDate nextDate=new NextDate(1995,12,5);
	private static NextDate nextDate2=new NextDate(2051,12,5);
	private static NextDate nextDate3=new NextDate(2008,2,28);
	private static NextDate nextDate4=new NextDate(2007,2,28);
	private static NextDate nextDate5=new NextDate(2007,12,31);
	private static NextDate nextDate6=new NextDate(2007,13,1);
	private static NextDate nextDate7=new NextDate(2007,1,32);
	private static NextDate nextDate8=new NextDate(1911,1,1);

	
	@Test
	public void testNextDay(){
		System.out.println(nextDate.nextDay());
		assertEquals("1995年12月6日", nextDate.nextDay());
	}
	@Test
	public void testNextDay2(){
		System.out.println(nextDate2.nextDay());
		assertEquals("1995年12月6日", nextDate2.nextDay());
	}
	@Test
	public void testNextDay3(){
		System.out.println(nextDate3.nextDay());
		assertEquals("2008年2月29日", nextDate3.nextDay());
	}
	@Test
	public void testNextDay4(){
		System.out.println(nextDate4.nextDay());
		assertEquals("2007年3月1日", nextDate4.nextDay());
	}
	@Test
	public void testNextDay5(){
		System.out.println(nextDate5.nextDay());
		assertEquals("2008年1月1日", nextDate5.nextDay());
	}
	@Test
	public void testNextDay6(){
		System.out.println(nextDate6.nextDay());
		assertEquals("输入非法", nextDate6.nextDay());
	}

	@Test
	public void testNextDay7(){
		System.out.println(nextDate7.nextDay());
		assertEquals("输入非法", nextDate7.nextDay());
	}
	@Test
	public void testNextDay8(){
		System.out.println(nextDate8.nextDay());
		assertEquals("输入非法", nextDate8.nextDay());
	}
}