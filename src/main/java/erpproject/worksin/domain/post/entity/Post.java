package erpproject.worksin.domain.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Post {

    @Id
    Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = false)
    private String description;


    public Post(String description,String title) {
        this.description = description;
        this.title = title;
    }

    public static Post of(String title,String description){

        return new Post(title,description);
    }

}
