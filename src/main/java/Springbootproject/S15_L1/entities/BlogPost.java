package Springbootproject.S15_L1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlogPost {
    private long ID;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPost(String categoria,String titolo,String cover,String contenuto,int tempoDiLettura){
        this.categoria=categoria;
        this.titolo=titolo;
        this.cover=cover;
        this.contenuto=contenuto;
        this.tempoDiLettura=tempoDiLettura;
    }

}
