import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddressService {

  constructor(private httpClient: HttpClient) {
  }

  getAllStartAddress(): Observable<any> {
    return this.httpClient.get('http://localhost:8080/address/list');
  }
}
