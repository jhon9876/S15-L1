package Springbootproject.S15_L1.services;

import Springbootproject.S15_L1.entities.Authors;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AuthorServices {
    private List<Authors> authorsList= new ArrayList<>();

    public List<Authors> getAllAuthors(){
        return authorsList;
    }

    public Authors saveAuthors(Authors a){
        Random rd= new Random();
        a.setID(rd.nextInt());
        authorsList.add(a);
        return a;
    }

    public Authors getSingleAuthor(Long AuthorsID){
        Authors as=null;
        for(Authors a : authorsList){
            if(a.getID()==AuthorsID){
                as=a;
            }
        }
        return as;
    }

    public Authors modifyAuthorById(long ID, Authors body){
        Authors as=null;
        for(Authors a : authorsList){
            if(a.getID()==ID){
                as=a;
            }
        }
        as.setNome(body.getNome());
        return as;
    }

}
