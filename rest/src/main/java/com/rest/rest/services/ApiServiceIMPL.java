package com.rest.rest.services;
 import com.rest.rest.dao.ApiDao;
import com.rest.rest.entities.Api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ApiServiceIMPL implements ApiService {
	
	@Autowired
	private ApiDao apiDao;

	public ApiServiceIMPL() {
		
	}

	@Override
	public List<Api> getApis() {
		
		return apiDao.findAll();
	}
	
	
	@Override
	public Api getApi(int ApiId) {
		
		return apiDao.getById(ApiId);
	}
}
