package com.wpc.dto;

import com.wpc.entity.Clazz;
import com.wpc.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ClassDTO {
    private Clazz clazz;
    private Student students;
}
