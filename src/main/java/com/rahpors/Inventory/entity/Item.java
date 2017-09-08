package com.rahpors.Inventory.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by ramon on 8/09/17.
 */

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "barcode")
    private String barcode;


    public Item() {
    }

    public Item(String description, BigDecimal price, String barcode) {
        this.description = description;
        this.price = price;
        this.barcode = barcode;
    }
}
