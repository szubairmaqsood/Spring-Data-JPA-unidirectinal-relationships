package com.example.Spring.Data.Unidirectional.relationships.models_ManyToOne

import javax.persistence.*

@Entity

class MyOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    /*
    1. @One to many will be used on one side
    2. @Join Column will make sure that Foreign key column will be made on many side instead of new table
    3.if we use @ManytoOne in order Items then @Join Column will be optional as default name will be there.
     */
    @OneToMany
    @JoinColumn(name="fk_Order")
    var orderItems:MutableList<OrderItems>;

    constructor(){
        id = 0;
        orderItems =ArrayList<OrderItems>();
    }
}