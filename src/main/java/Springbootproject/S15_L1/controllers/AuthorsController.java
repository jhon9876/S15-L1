package Springbootproject.S15_L1.controllers;

import Springbootproject.S15_L1.entities.Authors;
import Springbootproject.S15_L1.services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
@Autowired
private AuthorServices authorServices;

    @GetMapping
    public List<Authors> getAllAuthors(){
        return authorServices.getAllAuthors();
    }

    @PostMapping
    public Authors saveAuthor(@RequestBody Authors a){

        return authorServices.saveAuthors(a);
    }

    @GetMapping("/{ID}")
    public Authors getAuthorsById(@PathVariable Long ID){

        return authorServices.getSingleAuthor(ID);
    }

    @PutMapping("/{ID}")
    public Authors modifyAuthors(@PathVariable long ID, @RequestBody Authors body){


       return authorServices.modifyAuthorById(ID,body);
    }
}
