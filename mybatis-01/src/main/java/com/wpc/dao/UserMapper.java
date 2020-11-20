package com.wpc.dao;

import com.wpc.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Insert("insert into user (id, name, pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Select("select * from user where id=#{id}")
    User getUserById(Integer userId);

    @Select("select * from user")
    List<User> getAllUser();
}
