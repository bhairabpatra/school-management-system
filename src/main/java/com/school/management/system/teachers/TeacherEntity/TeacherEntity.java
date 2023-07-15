package com.school.management.system.teachers.TeacherEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "teacherTable")
public class TeacherEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotBlank(message = "Every teacher must have a first name")
    private  String first_name;

    @NotBlank(message = "Every teacher must have a last name")
    private  String last_name;

    @NotBlank(message = "Every teacher must have a email")
    private  String email;

    @NotBlank(message = "Every teacher must have a phone number")
    private String phone;

    @NotBlank(message = "Every teacher must have a DOB")
    private  String dob;

    @NotBlank(message = "Every teacher must have a Gender")
    private  String gender;

    @NotBlank(message = "Every teacher must have an address")
    private  String address;

    @NotBlank(message = "Every teacher must have Qualification")
    private  String qualification;

    private  String specialization;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
