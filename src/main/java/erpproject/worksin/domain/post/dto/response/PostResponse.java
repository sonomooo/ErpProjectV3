package erpproject.worksin.domain.post.dto.response;

import erpproject.worksin.domain.post.entity.Post;
import lombok.Builder;

@Builder
public record PostResponse(String title, String description) {

    //static 필수!
    public static PostResponse from(Post post){

        return PostResponse.builder()
                .title(post.getTitle())
                .description(post.getDescription())
                .build();
    }
}
