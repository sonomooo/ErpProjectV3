package ErpProject.ErpProjectV3.domain.brand.controller;

import ErpProject.ErpProjectV3.domain.brand.dto.request.BrandRequest;
import ErpProject.ErpProjectV3.domain.brand.dto.response.BrandResponse;
import ErpProject.ErpProjectV3.domain.brand.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;

    @PostMapping("/v1/brand")
    public BrandResponse createBrand(BrandRequest brandRequest){

        return brandService.createBrand(brandRequest);
    }

}
