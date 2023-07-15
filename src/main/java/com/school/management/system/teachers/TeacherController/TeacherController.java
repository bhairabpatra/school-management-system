package com.school.management.system.teachers.TeacherController;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;
import com.school.management.system.teachers.TeacherService.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher/")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("createTeacher")
    public ResponseEntity<TeacherEntity> createTeacher(@RequestBody TeacherEntity data){
        TeacherEntity teacher = teacherService.createTeacher(data);
        return  new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    @GetMapping("getTeachers")
    public ResponseEntity<List<TeacherEntity>> getAllTeachers(){
        List<TeacherEntity> allTeachers = teacherService.getAllTeacher();
        return  new ResponseEntity<>(allTeachers, HttpStatus.OK);

    }
}
