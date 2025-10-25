package erpproject.worksin.domain.orderhistory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderHistory {

    @Id
    Long id;


    Long order;
}
