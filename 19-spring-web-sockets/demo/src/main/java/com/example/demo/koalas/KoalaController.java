package com.example.demo.koalas;

import com.example.demo.employees.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/koalas")
public class KoalaController {


    @Autowired
    KoalaRepository repo;

    @GetMapping("/test")
    public String test() {
        Koala k1 = new Koala("Q");
        repo.save(k1);

        Koala k2 = new Koala("Picard");
        repo.save(k2);

        // add to the "owner" of the table
        // the one that the other "mapsBy"
        // or the one that defines the JoinTable
        // and then save it.
        k1.getLikes().add(k2);
        repo.save(k1);

        return "redirect:/koalas/";
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("koalas", repo.findAll());
        return "koalas/index";
    }
}
