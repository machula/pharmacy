package com.pharmacy.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.domain.User;
import com.pharmacy.entity.Drug;
import com.pharmacy.entity.Product;
import com.pharmacy.entity.SoldDrug;
import com.pharmacy.service.DrugService;
import com.pharmacy.service.ProductService;
import com.pharmacy.service.SoldDrugService;
import com.pharmacy.service.UserService;

@RestController
public class UserRest {

	@Autowired
	DrugService drugService;

	@Autowired
	UserService userService;

	@Autowired
	SoldDrugService soldDrugService;
	
	@Autowired
	ProductService productService;

	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public ResponseEntity<User> create(@RequestBody User user) {
		System.out.println("Hello from /user");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(path = "/get_drugs", method = RequestMethod.GET)
	public List<Drug> getDrugs() {
		System.out.println("access to /get_drugs");
		List<Drug> list = new ArrayList<Drug>();
		try {
			list = drugService.getAll();

		} catch (Throwable throwb) {
			throwb.printStackTrace();
		}
		return drugService.getAll();
	}

	@RequestMapping(path = "/get_users", method = RequestMethod.GET)
	public List<com.pharmacy.entity.User> getUsers() {
		System.out.println("access to /get_drugs");
		List<com.pharmacy.entity.User> list = new ArrayList<com.pharmacy.entity.User>();

		list = userService.getAll();
		for (com.pharmacy.entity.User user : list)
			System.out.println(user.getId() + "date   " + user.getPerson().getDateBirth().toString());

		return userService.getAll();
	}


	
	@RequestMapping(path = "/get_sold_drugs", method = RequestMethod.GET)
	public List<SoldDrug> getSoldDrugs() {
		return soldDrugService.getByStock(1);
	}


	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<com.pharmacy.entity.User> login(@RequestBody User userLogin) {
		System.out.println("Acces to /login2");
		System.out.println(userLogin.getLogin() + " " + userLogin.getPassword());
		List<com.pharmacy.entity.User> list = new ArrayList<com.pharmacy.entity.User>();
		list = userService.getAll();
			for(com.pharmacy.entity.User user: list) {
				if(userLogin.getLogin().equals(user.getLogin()) && userLogin.getPassword().equals(user.getPassword())) {
					return new ResponseEntity<com.pharmacy.entity.User>(user, HttpStatus.OK);
				}
			}
			return null;
	}
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public @ResponseBody com.pharmacy.entity.User login() {
		System.out.println("Acces to /login");
		List<com.pharmacy.entity.User> list = new ArrayList<com.pharmacy.entity.User>();
		list = userService.getAll();
		return list.get(0);
	}
	
	@RequestMapping(path = "/stock", method = RequestMethod.GET)
	public List<Product> getDrugsFromStock() {
		System.out.println("Acces to /stock");
		return productService.getByStock(1);
	}
	

	
	
	
	
	
	
}
