import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarTypeService {

  constructor(private http: HttpClient) {
  }

  getAllCarType(): Observable<any> {
    return this.http.get('http://localhost:8080/car_type/list');
  }
}
