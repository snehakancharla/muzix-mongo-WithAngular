package com.stackroute.muzix.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Track")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Track {
    @Id
    private  int id;
    private String name;
    private String comment;
}