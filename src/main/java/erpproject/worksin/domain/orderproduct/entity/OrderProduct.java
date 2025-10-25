package erpproject.worksin.domain.orderproduct.entity;

import erpproject.worksin.domain.order.Order;
import jakarta.persistence.Entity;

@Entity
public class OrderProduct {

    Long id;

    Order order;

}
