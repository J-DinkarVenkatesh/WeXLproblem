package com.wexl.problem.task.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wexl.problem.task.model.User;
import com.wexl.problem.task.model.UserResponse;
import com.wexl.problem.task.user.reporistory.UserRepository;

@RestController
@RequestMapping ("/user")
public class UserController {
	
	private UserRepository userRepo;
	
	public UserController (UserRepository userRepo) {
		this.userRepo=userRepo;
	}
	
	@PostMapping
	public List<User> getUserByGender(@RequestBody Map<String,String> request){
		String gender = request.get("gender");
		String apiUrl= "https://randomuser.me/api/?format=json&gender="+gender;
		
		ResponseEntity<UserResponse> responseEntity = 
				new RestTemplate().getForEntity(apiUrl, UserResponse.class);
		UserResponse userReponse = responseEntity.getBody();
		
		List<User> users = userReponse.getResults();
		for(User user :users) {
			String firstName = user.getName().getFirst();
			String lastName = user.getName().getLast();
			user.getName().setFirst("WeXL"+firstName);
			user.getName().setFirst("WeXL"+lastName);
		}
		userRepo.saveAll(users);
				return users;
	}

	@GetMapping
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
