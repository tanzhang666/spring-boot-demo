package com.learn.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {
    private Long id;

    private String name;

    private Integer age;

}