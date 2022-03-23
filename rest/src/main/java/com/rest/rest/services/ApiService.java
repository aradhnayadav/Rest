package com.rest.rest.services;
import java.util.List;
import com.rest.rest.entities.Api;

public interface ApiService {
 public List<Api> getApis();
 public Api getApi(int ApiId);
 }
