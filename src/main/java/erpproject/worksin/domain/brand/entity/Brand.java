package erpproject.worksin.domain.brand.entity;

import erpproject.worksin.domain.brand.enums.BrandStatus;
import erpproject.worksin.domain.product.entity.Product;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;         // 브랜드명
    private String description;  // 브랜드 설명

    private String logoUrl;      // 로고 이미지
    private String homepageUrl;  // 홈페이지 링크

    @Enumerated(EnumType.STRING)
    private BrandStatus status;  // ACTIVE / INACTIVE 등

    @OneToMany(mappedBy = "brand")
    private List<Product> products = new ArrayList<>();

    public Brand(String description, String homepageUrl, String logoUrl, String name, List<Product> products, BrandStatus status) {
        this.description = description;
        this.homepageUrl = homepageUrl;
        this.logoUrl = logoUrl;
        this.name = name;
        this.products = products;
        this.status = status;
    }

    public static Brand of(String description, String homepageUrl, String logoUrl, String name, List<Product> products){

        return new Brand(description, homepageUrl, logoUrl, name,products, BrandStatus.ACTIVE);
    }
}
