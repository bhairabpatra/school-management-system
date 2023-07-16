package com.school.management.system.teachers.TeacherController;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;
import com.school.management.system.teachers.TeacherService.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("getTeacher/{id}")
    public ResponseEntity<TeacherEntity> getTeacher(@PathVariable Long id){
        TeacherEntity teacher = teacherService.getTeacherById(id);
        return  new ResponseEntity<>(teacher,HttpStatus.OK);
    }

    @PutMapping("editTeacher/{id}")
    public  ResponseEntity<TeacherEntity> updateTeacher(@PathVariable("id") Long id, @RequestBody TeacherEntity teacher){
        teacher.setId(id);
        TeacherEntity updateTeacher = teacherService.editTeacher(teacher);
        return new ResponseEntity<>(updateTeacher, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable("id") Long id){
        teacherService.deleteTeacher(id);
        return  new ResponseEntity<>("Teacher successfully deleted!", HttpStatus.NOT_FOUND);
    }
}
