package erpproject.worksin.domain.post.service;

import erpproject.worksin.domain.post.dto.request.PostRequest;
import erpproject.worksin.domain.post.dto.response.PostResponse;
import erpproject.worksin.domain.post.entity.Post;
import erpproject.worksin.domain.post.repository.PostRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class PostService {

    private final PostRepository postRepository;

    public PostResponse createPost(PostRequest postRequest) {

        Post post = Post.of(postRequest.title(), postRequest.description());

        postRepository.save(post);

        return PostResponse.from(post);

    }
}
