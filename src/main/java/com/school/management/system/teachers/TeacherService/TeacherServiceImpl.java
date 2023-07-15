package com.school.management.system.teachers.TeacherService;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;
import com.school.management.system.teachers.TeacherRepository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherServiceImpl  implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepo;

    @Override
    public TeacherEntity createTeacher(TeacherEntity teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public List<TeacherEntity> getAllTeacher() {
        return teacherRepo.findAll();
    }
}

