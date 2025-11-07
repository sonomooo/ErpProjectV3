package erpproject.worksin.domain.product.entity;

import erpproject.worksin.domain.brand.entity.Brand;
import erpproject.worksin.domain.product.enums.SizeStatus;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "products")
public class Product {

    @Id
    Long id;

    String name;

    String cereal;
    String price;

    SizeStatus size;

    @JoinColumn(name = "brand_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    Brand brand;

    String model_info;
    String explain;

    public Product(Brand brand, SizeStatus size, String price, String name, String model_info, String explain, String cereal) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.name = name;
        this.model_info = model_info;
        this.explain = explain;
        this.cereal = cereal;
    }

    public static Product of(Brand brand, String cereal, String explain, String model_info, String name, String price, SizeStatus size) {

        return new Product(brand, size, explain,model_info,name,price,cereal);
    }
}
