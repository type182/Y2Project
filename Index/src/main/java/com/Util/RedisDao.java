package com.Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisDao {
	 @Value("${spring.redis.url}")
	    private String url;

	    @Value("${spring.redis.port}")
	    private int port;

	    @Value("${spring.redis.pool.timeout}")
	    private int timeout;

	    @Value("${spring.redis.pool.max-active}")
	    private int maxActive;

	    @Value("${spring.redis.pool.max-idle}")
	    private int maxIdle;

	    @Value("${spring.redis.pool.min-idle}")
	    private int minIdle;

	    @Value("${spring.redis.pool.max-wait}")
	    private long maxWaitMillis;
	    @Value("${spring.redis.password}")
	    private String password;
	
	@Bean
	public JedisPool JedisPool() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
     jedisPoolConfig.setMaxIdle(maxIdle);
     jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
     jedisPoolConfig.setMaxTotal(maxActive);
     jedisPoolConfig.setMinIdle(minIdle);
     JedisPool jedisPool = new JedisPool(jedisPoolConfig, url, port, timeout, password);
     System.out.println("注入成........");
     return  jedisPool;
	}
	
}
