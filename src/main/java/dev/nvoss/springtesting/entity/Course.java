package dev.nvoss.springtesting.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
@Data
public class Course {
    @Id
    @Column(name = "courseid")
    private String courseID;

    @Column(name = "coursename")
    private String courseName;
}
