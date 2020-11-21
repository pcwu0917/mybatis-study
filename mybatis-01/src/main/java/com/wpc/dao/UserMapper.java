package com.wpc.dao;

import com.wpc.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;


/**
 * mybatis优先查询xml文件，若找不到再查询注解
 */
public interface UserMapper {

    HashMap<String, String> selectUser(Integer id);

    int insertUser(User user);

    //    @Param()注解可以将形参的名称修改，以便于和mapper中使用的参数保持一致
    int deleteUserById(int userId);

    int updateUserInfo(User user);

    int batInsertUser(List<User> users);


    @Insert("insert into user (id, name, pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Select("select * from user where id=#{id}")
        //多个参数要使用@Param注解标记参数
    User getUserById(Integer userId);

    @Select("select * from user")
    List<User> getAllUser();

}
