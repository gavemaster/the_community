package com.woah.community;

import com.woah.community.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.woah.community.models.User;
@SpringBootApplication
public class TheCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCommunityApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			userRepository.save(new User("hoffbroo", "CL$mbpg!!69", "hoffbroo@gmail.com", "Zach", "Ringhoff", "908-344-7083"));
			userRepository.save(new User("dankfrank", "lilBird29", "dankfrank@gmail.com", "Frank", "Russo", "908-619-8732"));
			userRepository.save(new User("ratman", "iLoveDevito12", "joevesey@gmail.com", "Joe", "Vesey", "908-763-2463"));
			userRepository.save(new User("fatel", "jordanLoveIsGoated", "stephenmance@gmail.com", "Steve", "Mance", "908-763-7532"));
			userRepository.save(new User("quapPiece", "yankeesAllDay", "nickeckhardt@gmail.com", "Nick", "Eckhardt", "908-763-2763"));

		};
	}
}