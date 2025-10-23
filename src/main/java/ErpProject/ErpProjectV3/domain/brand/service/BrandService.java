package ErpProject.ErpProjectV3.domain.brand.service;

import ErpProject.ErpProjectV3.domain.brand.dto.request.BrandRequest;
import ErpProject.ErpProjectV3.domain.brand.dto.response.BrandResponse;
import ErpProject.ErpProjectV3.domain.brand.entity.Brand;
import ErpProject.ErpProjectV3.domain.brand.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandResponse createBrand(BrandRequest brandRequest) {

        Brand brand = Brand.of(brandRequest.BrandName());

        brandRepository.save(brand);

        return BrandResponse.from(brand);
    }
}
