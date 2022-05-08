package dev.nvoss.springtesting.service;

import dev.nvoss.springtesting.entity.Course;
import dev.nvoss.springtesting.entity.User;
import dev.nvoss.springtesting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getStudent(String studentID) {
        return userRepository.getById(studentID);
    }

    public List<Course> getStudentCourseList(final String userID) {
        return userRepository.getById(userID).getCourseList();
    }

}
