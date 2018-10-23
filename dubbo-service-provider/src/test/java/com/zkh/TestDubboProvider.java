package com.zkh;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDubboProvider {
	private static final Log log = LogFactory.getLog(TestDubboProvider.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
			synchronized (TestDubboProvider.class) {
				while (true) {
					try {
						TestDubboProvider.class.wait();
					} catch (InterruptedException e) {
						log.error("== synchronized error:",e);
					}
				}
			}
		} catch (Exception e) {
			log.error("== DubboProvider context start error:",e);
		}finally{
			//context.close();
		}
	}
    
}