package com.sprint2.book_store_webservice.controller;

import com.sprint2.book_store_webservice.jwt.JwtUtil;
import com.sprint2.book_store_webservice.model.Account;
import com.sprint2.book_store_webservice.model.AppUser;
import com.sprint2.book_store_webservice.model.LoginRequest;
import com.sprint2.book_store_webservice.model.LoginResponse;
import com.sprint2.book_store_webservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("public")
public class LoginRestController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IUserService iUserService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> generateToken(@RequestBody LoginRequest loginRequest) throws Exception {
        Account account = iUserService.findByAppUser_Email(loginRequest.getEmail());
        if (account == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            try {
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(account.getUsername(), loginRequest.getPassword())
                );
            } catch (Exception ex) {
                throw new Exception("invalid username/password");
            }
        }
        return new ResponseEntity<>(new LoginResponse(jwtUtil.generateToken(account.getUsername()), 5L), HttpStatus.OK);
    }
}
