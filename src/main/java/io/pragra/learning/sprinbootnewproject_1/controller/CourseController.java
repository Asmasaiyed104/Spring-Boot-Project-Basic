package io.pragra.learning.sprinbootnewproject_1.controller;

import io.pragra.learning.sprinbootnewproject_1.entity.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // Course
//Course:id,name,author
    /*
    *
    *
    * C:\Users\asmas\Desktop\Pragra\Project\SprinBootNewProject_1\target\SprinBootNewProject_1-0.0.1-SNAPSHOT.jar*/
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in short time"),
                new Course(2, "Learn DevOps", "in short time"),
                new Course(3, "Learn Azure", "in short time"),
                new Course(4, "Learn Google", "in short time")
        );
    }
}
