package erpproject.worksin.domain.brand.service;

import erpproject.worksin.domain.brand.dto.request.BrandRequest;
import erpproject.worksin.domain.brand.dto.response.BrandResponse;
import erpproject.worksin.domain.brand.entity.Brand;
import erpproject.worksin.domain.brand.repository.BrandRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandResponse createBrand(BrandRequest brandRequest) {
        Brand brand = Brand.of(brandRequest.name(), brandRequest.description(), brandRequest.logoUrl(), brandRequest.homePageUrl(), brandRequest.products());
        brandRepository.save(brand);

        return BrandResponse.from(brand);
    }
}
