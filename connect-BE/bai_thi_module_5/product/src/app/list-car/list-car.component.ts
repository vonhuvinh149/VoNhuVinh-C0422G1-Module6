import {Component, OnInit} from '@angular/core';
import {CarService} from '../service/car.service';
import {Car} from '../model/car';

@Component({
  selector: 'app-list-car',
  templateUrl: './list-car.component.html',
  styleUrls: ['./list-car.component.css']
})
export class ListCarComponent implements OnInit {

  car: Car[];
  cars: Car;

  constructor(private carService: CarService) {
  }

  ngOnInit(): void {
    this.getAllCar();
  }

  getAllCar() {
    this.carService.getAllCar().subscribe(next => {
      this.car = next.content;
      console.log(next);
    });
  }

  deleteModal(id: number) {
    this.carService.getById(id).subscribe(next => {
      this.cars = next;
    });
  }

  deleteCar(id: number) {
    this.carService.getDeleteCar(id).subscribe(next => {
    }, error => {
    }, () => {
      this.ngOnInit();
      alert('xoá thành công');
    });
  }
}
