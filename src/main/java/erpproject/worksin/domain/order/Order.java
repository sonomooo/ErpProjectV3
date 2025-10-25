package erpproject.worksin.domain.order;

import erpproject.worksin.domain.order.enums.OrderStatus;
import jakarta.persistence.Entity;

@Entity
public class Order {

    Long id;

    String orderId;
    String price;
    OrderStatus orderStatus;

    Long product_id;

    Long member_id;

    DiscountStatus discountStatus;

    String delivery;

    PaymentStatus paymentStatus;
}
