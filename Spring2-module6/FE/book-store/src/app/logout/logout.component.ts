import {Component, OnInit} from '@angular/core';
import {LoginService} from '../Service/login.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private loginService: LoginService,private router: Router) {
  }

  ngOnInit(): void {
    this.loginService.logOut();
  }

}
