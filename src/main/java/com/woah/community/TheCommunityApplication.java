package com.woah.community;

import com.woah.community.user.User;
import com.woah.community.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TheCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCommunityApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder encoder) {
		return args -> {
			userRepository.save(new User("hoffbroo", encoder.encode("CL$mbpg!!69"), "hoffbroo@gmail.com", "Zach", "Ringhoff", "908-344-7083"));
			userRepository.save(new User("dankfrank", encoder.encode("lilBird29"), "dankfrank@gmail.com", "Frank", "Russo", "908-619-8732"));
			userRepository.save(new User("ratman", encoder.encode("iLoveDevito12"), "joevesey@gmail.com", "Joe", "Vesey", "908-763-2463"));
			userRepository.save(new User("fatel", encoder.encode("jordanLoveIsGoated"), "stephenmance@gmail.com", "Steve", "Mance", "908-763-7532"));
			userRepository.save(new User("quapPiece", encoder.encode("yankeesAllDay"), "nickeckhardt@gmail.com", "Nick", "Eckhardt", "908-763-2763"));

		};
	}


}