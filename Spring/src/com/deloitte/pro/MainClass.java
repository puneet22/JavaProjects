package com.deloitte.pro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;
public class MainClass {
	

	private static ApplicationContext context;
	 public static void main(String[] args) {
	  context = new ClassPathXmlApplicationContext("Beans.xml");
	  JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

	     jc.getAddressList();
	     jc.getAddressSet();
	     jc.getAddressMap();
	     jc.getAddressProp();

	 }
}