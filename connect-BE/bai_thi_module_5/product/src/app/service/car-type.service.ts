import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CarTypeService {

  constructor(private http: HttpClient) {
  }

  getAllCarType() {
    return this.http.get('http://localhost:8080/car_type/list');
  }
}
