package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//�����������Դ���һ�������������������֧��Spring Session����HttpSession�������á�
//@EnableRedisHttpSessionע��ᴴ��һ��springSessionRepositoryFilter��bean����ȥʵ�������������
//�������������HttpSession��Ҳ����˵��HttpSession���ٷ������ã�
//����ͨ��������ʹ��redisֱ�Ӳ���Session��������ʵ����Session����
//maxInactiveIntervalInSeconds: ����SessionʧЧʱ��
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
	
}