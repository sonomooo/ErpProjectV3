package ErpProject.ErpProjectV3.domain.brand.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Brand {

    String name;

    @Builder
    public Brand(String name) {
        this.name = name;
    }

    public static Brand of(String name){

        return new Brand(name);

    }
}
