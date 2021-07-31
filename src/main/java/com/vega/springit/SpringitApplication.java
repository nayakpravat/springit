package com.vega.springit;

import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	//@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRep){
		return args -> {
			Link link = new Link("Getting Started with SprMaster of Computer ApplicationingBoot 2","https://therealdanvega.com/spring-boot-2");
			linkRepository.save(link);

			Comment comment = new Comment("This SpringBoot Link is awesome", link);
			commentRep.save(comment);
			link.addComment(comment);


		};
	}


}
