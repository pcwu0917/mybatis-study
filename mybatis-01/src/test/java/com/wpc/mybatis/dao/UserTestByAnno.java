package com.wpc.mybatis.dao;

import com.wpc.dao.UserMapper;
import com.wpc.entity.User;
import com.wpc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTestByAnno {

    private static SqlSession openSession = MybatisUtils.getOpenSession();
    private static UserMapper mapper = openSession.getMapper(UserMapper.class);

    @Test
    public void testInsert(){
        int i = mapper.addUser(new User().setName("zhangSan").setPwd("123456"));
        openSession.commit();
        System.out.println("插入成功");
    }

    @Test
    public void testDelete(){
        mapper.deleteUser(1);
        openSession.commit();
        System.out.println("删除成功");
    }

    @Test
    public void testUpdate(){
        User user=new User();
        user.setId(7).setName("wangwu").setPwd("12344321");
        int i = mapper.updateUser(user);
        openSession.commit();
        System.out.println(i+"更新成功");
    }

    @Test
    public void testSelect(){
        User user = mapper.getUserById(2);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
    }
}
