import {Component, OnInit} from '@angular/core';
import {Account} from '../model/Account';
import {LoginService} from '../Service/login.service';
import {LoginRequest} from '../model/LoginRequest';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  account: LoginRequest = new class implements LoginRequest {
    email: string;
    password: string;
  };

  constructor(private loginService: LoginService) {
  }

  ngOnInit(): void {
  }

  userLogin() {
    this.loginService.getLogin(this.account).subscribe(n => {
      alert("ok");
    },error => {
      console.log(error);
    });
  }
}
