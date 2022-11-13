package com.sprint2.book_store_webservice.service;

import com.sprint2.book_store_webservice.model.Account;
import com.sprint2.book_store_webservice.model.AppUser;

public interface IUserService {
    Account findByUsername(String username);

    Account findByAppUser_Email(String email);


}
