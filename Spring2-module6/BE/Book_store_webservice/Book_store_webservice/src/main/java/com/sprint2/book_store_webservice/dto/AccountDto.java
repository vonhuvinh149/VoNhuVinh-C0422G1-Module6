package com.sprint2.book_store_webservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
  private String username;
  private String password;
}
