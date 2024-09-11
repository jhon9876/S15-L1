package Springbootproject.S15_L1.services;

import Springbootproject.S15_L1.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {

    private List<BlogPost> blogPostList= new ArrayList<BlogPost>();

    public List<BlogPost> getAll(){
        return this.blogPostList;
    }

    public BlogPost saveBlogPost(BlogPost bg){
        Random rd= new Random();
        bg.setID(rd.nextInt());
        blogPostList.add(bg);

        return bg;

    }

    public BlogPost getSingleBlogPost(long userID){
            BlogPost b=null;
        for (BlogPost bx: this.blogPostList) {

            if(bx.getID()==userID){
                b=bx;
            }
        }
        return b;
    }

    public  BlogPost modifyBlogPost(long userID, BlogPost body){
        BlogPost b=null;
        for(BlogPost bx: this.blogPostList){
            if(bx.getID()==userID){
                b=bx;
            }
        }
                b.setCategoria(b.getCategoria());
        return b;
    }

    public void findAndDelete(long blogPostID){

        for(BlogPost bg : blogPostList){
            if(bg.getID()==blogPostID){
                blogPostList.remove(bg);
            }
        }
    }
}
