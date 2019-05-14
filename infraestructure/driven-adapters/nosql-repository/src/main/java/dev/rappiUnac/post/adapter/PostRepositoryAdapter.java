/*package dev.rappiUnac.post.adapter;

import dev.rappiUnac.post.entity.Post;
import dev.rappiUnac.post.gateway.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import dev.rappiUnac.post.data.PostDataRepository;

@Repository
public class PostRepositoryAdapter implements PostRepository {

    @Autowired
    private ConverterPost converterPost;

    @Autowired
    private PostDataRepository postDataRepository;

    @Override
    public Flux<Post> getPosts() {
        return postDataRepository.findAll().map(converterPost::toEntity);
    }
}
*/