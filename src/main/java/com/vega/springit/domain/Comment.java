package com.vega.springit.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String body;

    //Link
    @ManyToOne
    private Link link;

    public Comment(String body, Link link){
        this.body = body;
        this.link  = link;
    }
}
