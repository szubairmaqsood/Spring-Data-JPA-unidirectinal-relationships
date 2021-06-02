package com.example.Spring.Data.Unidirectional.relationships.model_OneToOne

import javax.persistence.*

@Entity
class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    private var name:String;
    /*
      In Customer a foreign key column will be made
     */
    @OneToOne
    @JoinColumn(name = "fk_shipping_Address")
    private var shoppingAddress:ShoppingAddress?;

    constructor(){
        id = 0;
        name="";
        shoppingAddress =null;
    }

}