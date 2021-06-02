package com.example.Spring.Data.Unidirectional.relationships.models_ManyToMany

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    private var productName:String;

    constructor(){
        id = 0;
        productName = "";
    }

}