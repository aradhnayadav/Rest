package com.rest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.rest.entities.Api;
import com.rest.rest.services.ApiService;


//@Controller
@RestController
public class myController {
	@Autowired
		private ApiService apiService;
	@GetMapping("/home")
	public String home() {
		return "home page" ;

}
	//get the courses
	@GetMapping("/api")
	public List<Api> getApis()
	{
		return this.apiService.getApis();
		
}
	@GetMapping("/api/{apiId}")
	public Api getApi(@PathVariable String apiId) {
		return this.apiService.getApi(Integer.parseInt(apiId));
	}
}