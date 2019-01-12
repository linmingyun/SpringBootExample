package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//这个配置类可以创建一个过滤器，这个过滤器支持Spring Session代替HttpSession发挥作用。
//@EnableRedisHttpSession注解会创建一个springSessionRepositoryFilter的bean对象去实现这个过滤器。
//过滤器负责代替HttpSession。也就是说，HttpSession不再发挥作用，
//而是通过过滤器使用redis直接操作Session。这样就实现了Session共享。
//maxInactiveIntervalInSeconds: 设置Session失效时间
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
	
}