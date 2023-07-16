package com.school.management.system.teachers.TeacherService;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;

import java.util.List;

public interface TeacherService {

    TeacherEntity createTeacher(TeacherEntity teacher);

    List<TeacherEntity> getAllTeacher();

    TeacherEntity getTeacherById(Long id);

    TeacherEntity editTeacher(TeacherEntity teacher);

    void  deleteTeacher(Long id);

}
