package com.kursovaya.kursach.controllers;

import com.kursovaya.kursach.models.Post;
import com.kursovaya.kursach.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

 @GetMapping("/blog")
 public String blogMain(Model model){
     Iterable<Post> posts = postRepository.findAll();
     model.addAttribute("posts",posts);
     return "blog-main";

 }
}
