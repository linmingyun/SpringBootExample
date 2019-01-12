package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository 接口是 spring Data 的一个核心接口，它不提供任何方法，
//开发者需要在自己定义的接口中声明需要的方法。
//基础的Repository提供了最基本的数据访问功能，其几个子接口则扩展了一些功能。它们的继承关系如下：
//Repository： 仅仅是一个标识，表明任何继承它的均为仓库接口类
//（1）CrudRepository： 继承 Repository，实现了一组 CRUD 相关的方法
//（2）PagingAndSortingRepository： 继承 CrudRepository，实现了一组分页排序相关的方法
//（3）JpaRepository： 继承 PagingAndSortingRepository，实现一组 JPA 规范相关的方法
//自定义的 XxxxRepository 需要继承 JpaRepository，
//这样的 XxxxRepository 接口就具备了通用的数据访问控制层的能力。
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
}