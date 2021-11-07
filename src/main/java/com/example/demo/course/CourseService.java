package com.example.demo.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.topic.Topic;
import com.example.demo.topic.TopicRepository;

@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private TopicRepository topicRepository;
		 
	 public List<Course> getAllCourses(String topicId){
		 List<Course> courses=new ArrayList<>();
		 courseRepository.findByTopicId(topicId)
		 .forEach(courses::add);
		 return courses;
	 }
	 
	 public Course getCourse(String id) {
		 return courseRepository.findById(id).orElseThrow();
	 }
	 
	 public void addCourse(Course course,String topicId) {
		 Topic topic=topicRepository.findById(topicId).orElseThrow();
		 course.setTopic(topic);
		 courseRepository.save(course);
	 }
	 
	 public void updateCourse(Course course,String topicId) {
		 Topic topic=topicRepository.findById(topicId).orElseThrow();
		 course.setTopic(topic);
		 courseRepository.save(course);
		 
	 }
	 
	 public void deleteCourse(String id) {
		 courseRepository.deleteById(id);
	 }

}
