package com.powershare.dal;


import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.powershare.dal.repositories.PostRepository;
import com.powershare.dom.Post;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/application.xml")
public class PostTest {

	@Autowired
	PostRepository repository;
	
	
	@Test
	public void test() {
		Post post = new Post();
		post.setDate(new Date());
		post.setNom("third member");


				repository.save(post);

		Post dbpost = repository.findOne(post.getIdpost());
		assertNotNull(dbpost);
		System.out.println(repository.findPostByName("first member").getNom());
		
	}	

}
