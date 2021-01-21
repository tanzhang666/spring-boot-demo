package com.learn.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Reference(interfaceClass = com.learn.springboot.service.StudentService.class,version = "1.0")
    private StudentService studentService;

    @RequestMapping("/students")
    private String queryAll(Model model){
        List<Student> students = studentService.queryAll();
        model.addAttribute("students",students);
        return "students";
    }

}
