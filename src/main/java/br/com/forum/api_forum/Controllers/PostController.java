package br.com.forum.api_forum.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.forum.api_forum.Entity.PostEntity;
import br.com.forum.api_forum.Services.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public PostEntity create(@RequestBody PostEntity data) {
        return postService.create(data);
    }

    @GetMapping
    public List<PostEntity> read () {
        return postService.read();
    }
}
