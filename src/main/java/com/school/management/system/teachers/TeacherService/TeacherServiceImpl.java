package com.school.management.system.teachers.TeacherService;

import com.school.management.system.teachers.Exception.TeacherNotFoundException;
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
    public TeacherEntity getTeacherById(Long id) throws TeacherNotFoundException {
        if(id == null)
            throw new TeacherNotFoundException("User id cant be Null");
        Optional<TeacherEntity> teacher = teacherRepo.findById(id);
        if(teacher.isPresent())
            return  teacher.get();
        throw new TeacherNotFoundException("Teacher id Not found");
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

