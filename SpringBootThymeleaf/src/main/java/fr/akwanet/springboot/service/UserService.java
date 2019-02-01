package fr.akwanet.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.akwanet.springboot.model.User;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<User>();
	
	public void addUser(User user) throws Exception {
		users.add(user);
	}
	
	public List<User> getAllUserArticles() {
		
		return users;
	}
}
