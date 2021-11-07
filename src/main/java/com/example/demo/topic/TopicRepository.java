package com.example.demo.topic;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{
	
	public Optional<Topic> findById(String topicId);

}
