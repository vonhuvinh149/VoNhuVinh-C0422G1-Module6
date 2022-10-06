import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Car} from '../model/car';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private httpClient: HttpClient) {
  }

  getAllCar(): Observable<any> {
    return this.httpClient.get('http://localhost:8080/vehicle/list');
  }

  getDeleteCar(id: number) {
    return this.httpClient.delete('http://localhost:8080/vehicle/remove/' + id);
  }

  getById(id: number) {
    return this.httpClient.get('http://localhost:8080/vehicle/display/' + id);
  }

  getUpdateCar(car: Car) {
    return this.httpClient.patch('http://localhost:8080/vehicle/update/' + car.id, car);
  }
}
