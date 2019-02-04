package ro.jademy.springtut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.repository.EmployeeRepository;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("employees")
    public String employee(Model model) {

        model.addAttribute("employees", employeeRepository.findAll());

        return "employees";
    }

    // employees/{id}

    // employees/{id}/delete
    // employees/{id}/add
    // employees/{id}/edit


}
