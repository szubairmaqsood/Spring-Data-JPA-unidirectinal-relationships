package com.example.Spring.Data.Unidirectional.relationships.models_ManyToMany

import javax.persistence.*

@Entity
class Store {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private var id:Long;
    private var storeName:String;

    /*
      1.In Unidirectional
      2.join column is this of entity
      3.Inverse join column will be of other table
      4. if we want to change direction to other clss same code can be copy and paste there
   */

    @ManyToMany
    @JoinTable( name = "store_Product",
        joinColumns = [ JoinColumn(name ="fk_store")],
        inverseJoinColumns= [ JoinColumn(name ="fk_product")]
    )

    private var products:MutableList<Products>?;

    constructor(){
        id=0;
        storeName="";
        products = null;
    }


}