package com.practice.department.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

public class UserList {
  private List<User> users;

  public UserList() {
    users = new ArrayList<>();
  }
}
