package dev.nvoss.springtesting;

import dev.nvoss.springtesting.entity.Course;
import dev.nvoss.springtesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{userId}/courses")
    public List<Course> getStudentCourseList(@PathVariable String studentId) {
        return userService.getStudentCourseList(studentId);
    }

}
