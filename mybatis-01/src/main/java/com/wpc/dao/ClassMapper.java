package com.wpc.dao;

import com.wpc.dto.ClassDTO;
import com.wpc.dto.ClassDTO2;
import com.wpc.entity.Student;

import java.util.List;

public interface ClassMapper {

    List<Student> getStudentByClassId(int classId);

    List<ClassDTO> getClassInfo(int classId);

    ClassDTO2 getClassInfo2(int classId);

}
