package dev.nvoss.springtesting.entity;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "u_username")
    private String username;

    @Column(name = "u_password")
    private String passwordHash;

    public User() {
        passwordHash = RandomStringUtils.randomAlphanumeric(18);
    }

    private List<Course> courseList = new ArrayList<>();

    public List<Course> getCourseList() {
        return courseList;
    }

    public String password() {
        return passwordHash;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Generated password: %s", username, passwordHash);
    }
}
