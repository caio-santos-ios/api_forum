package br.com.forum.api_forum.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.forum.api_forum.Entity.PostEntity;
import br.com.forum.api_forum.Repositories.PostRepository;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;

    public PostEntity create(PostEntity data) {
        return postRepository.save(data);
    }
 
    public List<PostEntity> read() {
        return postRepository.findAll();
    }
}