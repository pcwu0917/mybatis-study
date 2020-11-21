package com.wpc.mybatis.dao;

import com.wpc.dao.UserMapper;
import com.wpc.entity.User;
import com.wpc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class UserTestMapperXML {

    private static SqlSession session= MybatisUtils.getOpenSession();
    private static UserMapper userMapper=session.getMapper(UserMapper.class);

    @Test
    public void testSelectUser(){
        userMapper.selectUser(2);
    }

    @Test
    public void insertUser(){
        User user = new User().setName("xiaoWang").setPwd("123456");
        userMapper.insertUser(user);
        System.out.println(user.getId());
        session.commit();
    }

    @Test
    public void deleteUser(){
        System.out.println(userMapper.deleteUserById(2));
        session.commit();
    }

    @Test
    public void updateUserInfo(){
        System.out.println(userMapper.updateUserInfo(new User(4,"wpc","12345")));
        session.commit();
    }

    @Test
    public void batchInsert(){
        List<User> userList=new ArrayList<User>();
        userList.add(new User().setName("wz").setPwd("123"));
        userList.add(new User().setName("wpy").setPwd("1111"));
        int i = userMapper.batInsertUser(userList);
        System.out.println(i);
        session.commit();
    }
}
