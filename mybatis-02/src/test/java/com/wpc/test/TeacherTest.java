package com.wpc.test;

import com.wpc.dao.TeacherMapper;
import com.wpc.entity.Teacher;
import com.wpc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {

    private static SqlSession sqlSession= MybatisUtils.getOpenSession();
    private static TeacherMapper tmapper=sqlSession.getMapper(TeacherMapper.class);

    @Test
    /**
     * 测试一对多，寻找一位老师教哪些课程
     */
    public void testGetAll(){
        List<Teacher> teachers = tmapper.getAllTeacher();
        teachers.forEach(teacher -> System.out.println(teacher));
    }
}
