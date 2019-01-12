package com.example.web;

import java.util.List;

import com.example.domain.User;
import com.example.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	//@Cacheable可以标记在一个方法上，也可以标记在一个类上。
    //当标记在一个方法上时表示该方法是支持缓存的，
    //当标记在一个类上时则表示该类所有的方法都是支持缓存的。
    //对于一个支持缓存的方法，Spring会在其被调用后将其返回值缓存起来，
    //以保证下次利用同样的参数来执行该方法时可以直接从缓存中获取结果，
    //而不需要再次执行该方法。Spring在缓存方法的返回值时是以键值对进行缓存的，
    //值就是方法的返回结果，至于键的话，Spring又支持两种策略，默认策略和自定义策略。
    //需要注意的是当一个支持缓存的方法在对象内部被调用时是不会触发缓存功能的。
    //@Cacheable可以指定三个属性，value、key和condition。
    //value属性是必须指定的，其表示当前方法的返回值是会被缓存在哪个Cache上的，对应Cache的名称。
    //其可以是一个Cache也可以是多个Cache，当需要指定多个Cache时其是一个数组。
    //key属性是用来指定Spring缓存方法的返回结果时对应的key的。
    //该属性支持SpringEL表达式。当我们没有指定该属性时，Spring将使用默认策略生成key。
    //有的时候我们可能并不希望缓存一个方法所有的返回结果。通过condition属性可以实现这一功能。
    //condition属性默认为空，表示将缓存所有的调用情形。其值是通过SpringEL表达式来指定的，
    //当为true时表示进行缓存处理；当为false时表示不进行缓存处理，
    //即每次调用该方法时该方法都会执行一次。
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
    	User user=userRepository.findByUserName("aa");
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return user;
    }
    
    @RequestMapping("/getUsers")
    @Cacheable(value="key-Users")
    public List<User> getUsers() {
    	List<User> users=userRepository.findAll();
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return users;
    }
}