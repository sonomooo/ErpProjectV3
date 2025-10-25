package erpproject.worksin.domain.brand;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Brand {

    @Id
    Long Id;

    String name;
    String content;

    @OneToOne
    Long product_Id;
}
