package com.wpc.test;

import com.wpc.dao.CourseMapper;
import com.wpc.entity.Course;
import com.wpc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CourseTest {
    private static SqlSession sqlSession= MybatisUtils.getOpenSession();
    private static CourseMapper cMapper=sqlSession.getMapper(CourseMapper.class);

    @Test
    /**
     * 测试多对一，寻找每一个课程对应的哪位老师
     */
    public void testGetAll(){
        List<Course> courseList = cMapper.getAll();
        courseList.forEach(course -> System.out.println(course));
    }
}
