package com.angulardemo.spring.angularDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public UserDetails addUser(@RequestBody UserDetails userDetails) {
		return userService.addUser(userDetails);

	}

	@RequestMapping(value = "/addLabour", method = RequestMethod.POST)
	public LabourDetails addLabour(@RequestBody LabourDetails labourDetails) {
		return userService.addLabour(labourDetails);

	}

}
