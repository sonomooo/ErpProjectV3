package erpproject.worksin.domain.brand.controller;

import erpproject.worksin.common.response.ApiPageResponse;
import erpproject.worksin.common.response.ApiResponse;
import erpproject.worksin.domain.brand.dto.request.BrandRequest;
import erpproject.worksin.domain.brand.dto.response.BrandResponse;
import erpproject.worksin.domain.brand.service.BrandService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@RequestMapping("/api")
public class brandController {

    private final BrandService brandService;

    @PostMapping("/brands")
    public ResponseEntity<ApiResponse<BrandResponse>> createBrand(@RequestBody BrandRequest brandRequest){

        BrandResponse brand = brandService.createBrand(brandRequest);

        return ApiResponse.created(brand);
    }

}
