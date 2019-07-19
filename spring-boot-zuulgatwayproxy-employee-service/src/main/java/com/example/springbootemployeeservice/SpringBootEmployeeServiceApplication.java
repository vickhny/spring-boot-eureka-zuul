package com.example.springbootemployeeservice;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootemployeeservice.model.Employee;
 
@RestController
@SpringBootApplication
public class SpringBootEmployeeServiceApplication
{
    @RequestMapping(value = "/echoEmployeeName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
    @RequestMapping(value = "/getEmployeeDetails/{name}")
    public Employee getStudentDetails(@PathVariable(name = "name") String name)
    {
        return new Employee(name, "IT", "4291");
    }
 
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootEmployeeServiceApplication.class, args);
    }
}
