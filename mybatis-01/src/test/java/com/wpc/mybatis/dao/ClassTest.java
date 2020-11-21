package com.wpc.mybatis.dao;

import com.wpc.dao.ClassMapper;
import com.wpc.dto.ClassDTO;
import com.wpc.dto.ClassDTO2;
import com.wpc.entity.Student;
import com.wpc.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ClassTest {

    private SqlSession sqlSession= MybatisUtils.getOpenSession();
    private ClassMapper classMapper=sqlSession.getMapper(ClassMapper.class);

    @Test
    public void getStudentByClassId(){
        List<Student> students = classMapper.getStudentByClassId(1);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testJoin(){
        List<ClassDTO> classInfo = classMapper.getClassInfo(1);
        classInfo.forEach(info->{
            System.out.println(info);
        });
    }
    @Test
    public void testJoin2(){
        System.out.println(classMapper.getClassInfo2(1));
    }
}
