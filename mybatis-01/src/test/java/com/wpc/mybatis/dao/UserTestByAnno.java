package com.wpc.mybatis.dao;

import com.wpc.dao.UserMapper;
import com.wpc.entity.User;
import com.wpc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTestByAnno {

    private static SqlSession openSession = MybatisUtils.getOpenSession();
    private static UserMapper mapper = openSession.getMapper(UserMapper.class);

    @Test
    public void testInsert(){
        int i = mapper.addUser(new User().setName("zhangSan").setPwd("123456"));
        openSession.commit();
        System.out.println("插入成功");

    }
}
