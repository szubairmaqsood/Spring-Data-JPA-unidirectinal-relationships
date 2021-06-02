package com.example.Spring.Data.Unidirectional.relationships.models

import javax.persistence.*

@Entity

class OrderItems {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    private var description:String;

    constructor(){
        id = 0;
       description="";
    }
}