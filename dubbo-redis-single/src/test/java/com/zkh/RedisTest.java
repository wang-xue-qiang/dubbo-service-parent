package com.zkh;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import redis.clients.jedis.Jedis;
public class RedisTest {
	private static final Log log = LogFactory.getLog(RedisTest.class);
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("192.168.174.128");
		String key = "wusc",value = "";
		jedis.set(key, "WuShuicheng"); // 存数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);
		jedis.set(key, "WuShuicheng2"); // 存数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);
	}
}
