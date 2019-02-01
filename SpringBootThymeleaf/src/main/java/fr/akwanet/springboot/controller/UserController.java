package fr.akwanet.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.akwanet.springboot.model.User;
import fr.akwanet.springboot.service.UserMongoService;

@Controller
@RequestMapping("app")
public class UserController {
	@Autowired
	UserMongoService userMongoService;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Display (get) the user creation page
	 * 
	 * @return
	 */
	@GetMapping("create-user")
	public ModelAndView createUserView() {
       	logger.info("$$ GET createUserView ...");
       	
		ModelAndView mav = new ModelAndView();
//		mav.setViewName("user-creation");
		mav.setViewName("user-management");
		mav.addObject("user", new User());
		mav.addObject("allProfiles", getProfiles());
		return mav;
	}

	/**
	 * Display (get) the users list page
	 * 
	 * @return
	 */
	@GetMapping("users-list")
	public ModelAndView usersListView() {
       	logger.info("$$ GET usersListView ...");
       	
		ModelAndView mav = new ModelAndView();
		List<User> ul;
	    mav.addObject("allUsers", ul=userMongoService.getUsers());
	    mav.setViewName("user-info");
	    for (User u:ul) {
	    	logger.info("# User: "+u);
	    }
		return mav;
	}

	/**
	 * Process the user creation
	 * 
	 * @param user
	 * @param result
	 * @return
	 */
	@PostMapping("create-user")
	public ModelAndView createUser(@Valid User user, BindingResult result) {
       	logger.info("$$ POST createUser ...");
    	logger.info("@@ User posted: "+user);
       	
	    ModelAndView mav = new ModelAndView();
	    if(result.hasErrors()) {
	       	logger.info("Validation errors while submitting form.");
//	       	mav.setViewName("user-creation");
			mav.setViewName("user-management");
	        mav.addObject("user", user);
	        mav.addObject("allProfiles", getProfiles());
	        return mav;
	    }	
	    
	    try {
	    	userMongoService.addUser(user);
	    }
	    catch (Exception e) {
			e.printStackTrace();
		}
	    
	    mav.addObject("allUsers", userMongoService.getUsers());
	    mav.setViewName("user-info");
	    logger.info("Form submitted successfully.");	    
	    return mav;	
	   }

	protected List<String> getProfiles() {
		List<String> list = new ArrayList<String>();
		list.add("Developer");
		list.add("Manager");
		list.add("Director");
		return list;
	}
}
