package com.sprint2.book_store_webservice.service.impl;

import com.sprint2.book_store_webservice.model.Account;
import com.sprint2.book_store_webservice.repository.IUserRepository;
import com.sprint2.book_store_webservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private IUserService iUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iUserService.findByUsername(username);
        return new org.springframework.security.core.userdetails.User(account.getUsername(),account.getPassword(),new ArrayList<>());
    }
}
