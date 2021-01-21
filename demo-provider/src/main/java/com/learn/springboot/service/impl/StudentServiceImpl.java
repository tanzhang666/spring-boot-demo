package com.learn.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.learn.springboot.mapper.StudentMapper;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = com.learn.springboot.service.StudentService.class,version = "1.0")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryAll() {
        return studentMapper.selectAll();
    }
}
