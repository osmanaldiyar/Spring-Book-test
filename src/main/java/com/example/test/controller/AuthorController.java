package com.example.test.controller;

import com.example.test.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Springboot samaya halyava pri napisanii web НО: если в проекте будет ошибка разобраться будет сложно из-за не знания

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors",authorRepository.findAll());

        return "authors";
    }

}
