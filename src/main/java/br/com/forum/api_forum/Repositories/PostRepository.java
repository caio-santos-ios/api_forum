package br.com.forum.api_forum.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.api_forum.Entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
   
}