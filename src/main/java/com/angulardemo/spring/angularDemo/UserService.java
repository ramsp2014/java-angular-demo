package com.angulardemo.spring.angularDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LabourRepo labourRepo;

	public UserDetails addUser(UserDetails userDetails) {
		userDetails = userRepository.save(userDetails);
		return userDetails;

	}

	public LabourDetails addLabour(LabourDetails labourDetails) {

		return labourRepo.save(labourDetails);
	}

}
