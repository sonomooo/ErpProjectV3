package erpproject.worksin.domain.post.controller;

import erpproject.worksin.common.response.ApiResponse;
import erpproject.worksin.domain.post.dto.request.PostRequest;
import erpproject.worksin.domain.post.service.PostService;
import erpproject.worksin.domain.product.dto.response.ProductResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class PostController {

    private final PostService postService;

    @PostMapping("/v1/create")
    public ResponseEntity<ApiResponse<ProductResponse>> createPost(@RequestBody PostRequest postRequest){

        return ApiResponse.success(postService.createPost(postRequest));
    }


}
