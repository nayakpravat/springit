package com.vega.springit.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Link extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String url;

    public Link(String title, String url){
        this.title = title;
        this.url = url;
    }

    //comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<Comment>();

    public void addComment(Comment comment){
        comments.add(comment);
    }
}
