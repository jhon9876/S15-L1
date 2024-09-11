package Springbootproject.S15_L1.controllers;

import Springbootproject.S15_L1.entities.BlogPost;
import Springbootproject.S15_L1.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {
    @Autowired
    private BlogPostService bg = new BlogPostService();



    @GetMapping
    public List<BlogPost> getBlogPosts(){
        return bg.getAll();
    }

    @GetMapping("/{ID}")
    public BlogPost getSingleBlogPost(@PathVariable int ID){

        return bg.getSingleBlogPost(ID);
    }

    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPost body){

        return bg.saveBlogPost(body);
    }

    @PutMapping("/{ID}")
    public BlogPost ModifyBlogPost(@PathVariable int ID, @RequestBody BlogPost body){

        return bg.modifyBlogPost(ID, body);
    }

    @DeleteMapping("/{ID}")
    public void DeleteBlogPost(@PathVariable int ID){

        bg.findAndDelete(ID);
    }

}
