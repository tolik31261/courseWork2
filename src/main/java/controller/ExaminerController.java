package controller;


import model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ExaminerServiceImpl;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExaminerController {
    private final ExaminerServiceImpl examinerService;

    public ExaminerController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable Integer amount) {
        return examinerService.getQuestions(amount);
    }

}
