package com.example.demo.fish;

import com.example.demo.koalas.Koala;
import com.example.demo.koalas.KoalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/fishs")
public class FishController {

    @Autowired
    FishRepository repo;

    @Autowired
    FishLikeRepository likeRepo;

    @GetMapping("/test")
    public String test() {
        Fish k1 = new Fish("Q");
        repo.save(k1);

        Fish k2 = new Fish("Picard");
        repo.save(k2);

        // because we're manually mapping the fishlikes
        // we have to create a new one and save it
        // but after that, it'll be available when you query!
        FishLike like = new FishLike(k1, k2, new Date());
        likeRepo.save(like);

        return "redirect:/fishs/";
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("fishs", repo.findAll());
        return "fishs/index";
    }

}
