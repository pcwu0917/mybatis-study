package com.wpc.dao;

import com.wpc.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Insert("insert into user (id, name, pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);

    @Select("select * from user where id=#{id}")
    User getUserById2(Integer userId);
}
