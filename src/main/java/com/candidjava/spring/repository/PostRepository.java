package com.candidjava.spring.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.candidjava.spring.bean.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
