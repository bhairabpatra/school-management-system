package com.school.management.system.teachers.TeacherService;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;

import java.util.List;

public interface TeacherService {

    public TeacherEntity createTeacher(TeacherEntity teacher);

    public List<TeacherEntity> getAllTeacher();

}
