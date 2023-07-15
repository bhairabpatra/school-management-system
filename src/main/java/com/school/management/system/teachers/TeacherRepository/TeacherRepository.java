package com.school.management.system.teachers.TeacherRepository;

import com.school.management.system.teachers.TeacherEntity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity , Long> {
}
