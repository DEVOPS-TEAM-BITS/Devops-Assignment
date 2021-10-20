package com.practice.department.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
  private Long userId;
  private String firstName;
  private String lastName;
  private String emailId;
  private Long departmentId;
}
