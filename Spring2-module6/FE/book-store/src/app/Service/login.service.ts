import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {LoginRequest} from '../model/LoginRequest';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private httpClient: HttpClient) {
  }

  getLogin(account: LoginRequest): Observable<any> {
    return this.httpClient.post('http://localhost:8080/public/login', account);
  }
}
