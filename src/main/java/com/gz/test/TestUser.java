package com.gz.test;

import com.gz.dao.pojo.UserInfo;
import com.gz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUser {
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
    static UserInfo userInfo = new UserInfo();


    @Test
    public void tes(){
        userInfo.setUsername("zs");
        userInfo.setPassword("123");
        UserService bean = context.getBean(UserService.class);
        boolean b = bean.loginCheck(userInfo);
        System.out.println(b);
    }
    /**
     * 查询所有
     */
    @Test
    public void test(){
        UserService bean = context.getBean(UserService.class);
        List<UserInfo> list = bean.getAll(userInfo);
        for (UserInfo user : list) {
            System.out.println(user);
        }
    }

    /**
     *
     * 增加
     */
    @Test
    public void test1(){
        userInfo.setUsername("sl");
        userInfo.setPassword("123456");
        userInfo.setName("顺六");
        userInfo.setEmail("sl@qq.com");
        userInfo.setStatus(1);
        UserService userService = context.getBean(UserService.class);
        if(userService.getAdd(userInfo)){
            System.out.println("add success");
        }else {
            System.out.println("add failure");
        }
    }

    /**
     * 删除
     */
    @Test
    public void test2(){
        UserService bean = context.getBean(UserService.class);
        userInfo.setUserId(42);
        boolean delete = bean.getDelete(userInfo);
        System.out.println(delete);
    }


    /**
     * 修改
     */
    @Test
    public void test3(){
        UserService bean = context.getBean(UserService.class);
        userInfo.setUserId(3);
        userInfo.setUsername("zs");
        userInfo.setPassword("123456");
        userInfo.setName("趴爬山");
        userInfo.setEmail("zs@163.com");
        userInfo.setStatus(1);
        boolean amend = bean.getAmend(userInfo);
        System.out.println(amend);
    }
}
