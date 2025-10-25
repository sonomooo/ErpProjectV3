package erpproject.worksin.domain.coupon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Coupon {

    @Id
    Long id;

    String name;
    String discount;

    // 최소 주문 금액
    String least;

    String discountAmount;

    LocalDateTime getPeriod;
    LocalDateTime usePeriod;

    String content;

}
