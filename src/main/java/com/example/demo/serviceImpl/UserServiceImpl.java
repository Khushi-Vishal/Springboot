package com.example.demo.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(String id, User user) {
		User user1 = userRepo.findById(id).get();
		if (user1 != null) {
			user1.setName(user.getName());
			user1.setUserName(user.getUserName());
			userRepo.save(user1);
			return user1;
		}
		throw new UserNotFoundException("Invalid ID: User not found");
	}

	@Override
	public User deleteUser(String id) {
		User user2 = userRepo.findById(id).get();
		if (user2 != null) {
			userRepo.delete(user2);
			return user2;
		}
		throw new UserNotFoundException("Invalid ID: User not found");
	}

	public User UserAuth(String userName, String password) {

		List<User> a2 = userRepo.findByUserName(userName);
		for (User u : a2) {

			if (u.getUserName().equals(userName) && u.getPassword().equals(password)) {
				return u;
			}

		}
		return null;
	}

}
