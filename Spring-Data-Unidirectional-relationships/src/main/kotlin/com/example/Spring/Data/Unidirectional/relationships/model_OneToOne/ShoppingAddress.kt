package com.example.Spring.Data.Unidirectional.relationships.model_OneToOne

import javax.persistence.*

@Entity
class ShoppingAddress {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    private var address:String;


    constructor(){
        id = 0;
        address="";
    }
}