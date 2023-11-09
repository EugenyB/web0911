package com.example.web0911.controllers;

import com.example.web0911.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class MainController {

    private StudentService studentService;

    @GetMapping("/home/{color}")
    public String home(@PathVariable String color,
                       @RequestParam String username,
                       Model model) {
        model.addAttribute("username", username);
        model.addAttribute("color", color);
        return "home";
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.getStudents());
        return "students";
    }
}
