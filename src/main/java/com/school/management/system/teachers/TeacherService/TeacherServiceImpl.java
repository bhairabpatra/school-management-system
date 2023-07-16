package com.school.management.system.teachers.TeacherService;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;
import com.school.management.system.teachers.TeacherRepository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    @Override
    public TeacherEntity getTeacherById(Long id)  {
        Optional<TeacherEntity> teacher = teacherRepo.findById(id);
            return  teacher.get();
    }

    @Override
    public TeacherEntity editTeacher(TeacherEntity teacher) {
        TeacherEntity existTeacher = teacherRepo.findById(teacher.getId()).get();
        existTeacher.setFirst_name(teacher.getFirst_name());
        existTeacher.setPhone(teacher.getPhone());
        TeacherEntity updatedTeacher = teacherRepo.save(existTeacher);
        return updatedTeacher;
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepo.deleteById(id);
    }
}

