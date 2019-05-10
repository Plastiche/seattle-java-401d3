package com.example.demo.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepo repo;

    @GetMapping("/test")
    public String test() {
        Employee boss = new Employee("Picard");
        repo.save(boss);

        Employee peon1 = new Employee("Number 2's Beard");
        peon1.setManager(boss);
        repo.save(peon1);

        // this will work, even if you query for it later
        // peon1.getManager().getName()

        Employee peon2 = new Employee("Uhura");
        peon2.setManager(boss);
        repo.save(peon2);

        // We don't need to do this
        // only the "owner" (the mappedBy) property needs to be set
        // and saved.
//        boss.getEmployees().add(peon1);

        // after we've created our test employees
        // let's redirect to the main route
        return "redirect:/employees";
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("employees", repo.findAll());
        return "employees/index";
    }
}
