package ErpProject.ErpProjectV3.domain.product.repository;

import ErpProject.ErpProjectV3.domain.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryImpl extends JpaRepository<Product,Long> {

    Product save(Product product);

    Page<Product> findByProductNameContaining(String keyword, PageRequest pageable);
}
