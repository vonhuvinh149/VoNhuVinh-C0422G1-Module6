package com.sprint2.book_store_webservice.service.impl;

import com.sprint2.book_store_webservice.model.Account;
import com.sprint2.book_store_webservice.repository.IUserRepository;
import com.sprint2.book_store_webservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public Account findByUsername(String username) {
        return this.iUserRepository.findByUsername(username);
    }

    @Override
    public Account findByAppUser_Email(String email) {
        return this.iUserRepository.findByAppUser_Email(email);
    }

}
