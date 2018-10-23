package com.zkh;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zkh.service.UserService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring/spring-context.xml"})
public class TestDubboConsumer {
	
	private static final Log log = LogFactory.getLog(TestDubboConsumer.class);
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			UserService serice = (UserService) context.getBean("userService");
			System.out.println(serice.findById("1"));
			context.start();
		} catch (Exception e) {
			log.error("== DubboProvider context start error:",e);
		}finally{
			context.close();
		}
	}
    
}