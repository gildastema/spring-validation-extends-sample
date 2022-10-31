package com.gildastema.springvalidationextends_app;

import javax.persistence.*;

@Entity
@Table(name = "hello")
public class Hello {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
