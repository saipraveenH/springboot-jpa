package com.candidjava.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.candidjava.spring.bean.PostDetails;

public interface PostDetailsRepository extends CrudRepository<PostDetails, Long> {

}
