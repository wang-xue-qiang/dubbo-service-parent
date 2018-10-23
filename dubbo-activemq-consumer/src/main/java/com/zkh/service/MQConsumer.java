package com.zkh.service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MQConsumer {
	private static final Log log = LogFactory.getLog(MQConsumer.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context= new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
		} catch (Exception e) {
			log.error("==>MQ context start error:", e);
			System.exit(0);
		}
	}
}
