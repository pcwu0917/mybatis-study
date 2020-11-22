package com.wpc.dao;

import com.wpc.entity.Course;
import com.wpc.entity.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {

    List<Course> getAll();
}
