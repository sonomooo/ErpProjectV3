package erpproject.worksin.domain.cart.entity;

import jakarta.persistence.Entity;

@Entity
public class Cart {

    Long id;

    Long product_id;

    Integer quantity;

    String product_price;

}
