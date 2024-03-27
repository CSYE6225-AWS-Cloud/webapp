package com.neu.csye6225.cloud.entity;

import com.neu.csye6225.cloud.dao.VerifyDao;
import com.neu.csye6225.cloud.model.Verify;

public class EventArtifact {

  private String username;
  private String token;

  public EventArtifact(String username, String token) {
    this.username = username;
    this.token = token;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
