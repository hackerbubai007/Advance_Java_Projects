package com.kodewala.bookmyshow.controller;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kodewala.bookmyshow.controller.bean.ReSellerProfile;
import com.kodewala.config.HibernateConfiguration;

@Controller
public class ProfileController {

	ReSellerProfile sellerProfile1;

	@RequestMapping("/profile")
	public ModelAndView createProfile() {

		System.out.println("profile hitted.......");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("CreateProfile");
		return modelAndView;

	}

	@PostMapping("/loginPage")
	public String login(@ModelAttribute ReSellerProfile sellerProfile, Model model) {
		this.sellerProfile1 = sellerProfile;

		HibernateConfiguration configuration = new HibernateConfiguration();

		Session session = configuration.hibernateConfiguration();
		Transaction txn = session.beginTransaction();
		
		session.save(sellerProfile);
		txn.commit();

		String name = sellerProfile.getFirstName();
		String mob = sellerProfile.getMobile();

		String userId = generateUniqueId(name, mob);
		model.addAttribute("userID", userId);
		model.addAttribute("userName", name);

		return "login";
	}

	@PostMapping("/validateLogin")
	public String validateLogin(@RequestParam("email") String email, @RequestParam("password") String password) {

		boolean result = isValidUser(email, password);
		if (result) {

			return "validationpage";
		} else {
			return "Errorpage";
		}

	}

	public static String generateUniqueId(String name, String mobile) {
		String base = name + mobile + UUID.randomUUID();
		return base.hashCode() < 0 ? "ID" + Math.abs(base.hashCode()) : "ID" + base.hashCode();
	}

	@RequestMapping("/loginForDirect")
	public ModelAndView loginForDirect() {

		System.out.println("Login hitted.......");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("loginfordirect");
		return modelAndView;

	}

	public boolean isValidUser(String email1, String password1) {

		if (sellerProfile1.getEmail().equals(email1) && sellerProfile1.getPassword().equals(password1)) {
			return true;
		}

		return false;

	}

	@RequestMapping("/validationPage")
	public ModelAndView loggedpage() {

		System.out.println("validationPage hitted.......");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("loggedPage");
		return modelAndView;

	}

	@RequestMapping("/errorPage")
	public ModelAndView errorPage() {

		System.out.println("validationPage hitted.......");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("login");
		return modelAndView;

	}

}
