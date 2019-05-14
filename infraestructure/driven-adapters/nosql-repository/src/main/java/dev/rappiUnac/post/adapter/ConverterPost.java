/*package dev.rappiUnac.post.adapter;

import dev.rappiUnac.generic.ObjectMapperDomain;
import dev.rappiUnac.post.data.PostData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactive.mapper.ObjectMapper;

@Component
public class ConverterPost implements ObjectMapperDomain {

    @Autowired
    private ObjectMapper mapper;

    public Post toEntity(PostData postData){
        return mapper.map(postData, Post.class);
    }

    public PostData toData(Post post){
        return mapper.map(post, PostData.class);
    }

}
*/