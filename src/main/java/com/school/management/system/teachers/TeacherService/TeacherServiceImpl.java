package com.school.management.system.teachers.TeacherService;

import com.school.management.system.teachers.Exception.NoDataFoundException;
import com.school.management.system.teachers.Exception.ResourceNotFoundException;
import com.school.management.system.teachers.TeacherEntity.TeacherEntity;
import com.school.management.system.teachers.TeacherRepository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TeacherServiceImpl  implements TeacherService {

    private static List<TeacherEntity> list = new ArrayList<>();
    @Autowired
    private TeacherRepository teacherRepo;

    @Override
    public TeacherEntity createTeacher(TeacherEntity teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public List<TeacherEntity> getAllTeacher() {
        List<TeacherEntity> list = teacherRepo.findAll();
        if(list.size() > 0){
            return list;
        }else {
            throw new NoDataFoundException("No employees available");
        }

    }

    @Override
    public TeacherEntity getTeacherById(Long id)  {
        Optional<TeacherEntity> teacher = teacherRepo.findById(id);
        if (!teacher.isPresent()) {
            throw new ResourceNotFoundException("Product not found for the id->"+id);
        }
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

