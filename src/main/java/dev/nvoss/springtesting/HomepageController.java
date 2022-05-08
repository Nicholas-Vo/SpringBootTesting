package dev.nvoss.springtesting;

import dev.nvoss.springtesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HomepageController {

    @Autowired
    private final UserService userService;

    public HomepageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/newstudent")
    public String getStudentAsString(@PathVariable String studentId) {
        return userService.getStudent(studentId).toString();
    }

}
