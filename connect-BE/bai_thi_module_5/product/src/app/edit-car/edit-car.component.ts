import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {AddressService} from '../service/address.service';
import {CarService} from '../service/car.service';
import {StartAddress} from '../model/startAddress';
import {EndtAddress} from '../model/endAddress';
import {Car} from '../model/car';

@Component({
  selector: 'app-edit-car',
  templateUrl: './edit-car.component.html',
  styleUrls: ['./edit-car.component.css']
})
export class EditCarComponent implements OnInit {
  formUpdateCar: FormGroup;
  startAddress: StartAddress[];
  endAddress: EndtAddress[];
  car: Car;

  constructor(private activatedRoute: ActivatedRoute, private addressService: AddressService,
              private carService: CarService, private router: Router) {
    activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      // tslint:disable-next-line:radix
      this.carService.getById(parseInt(id)).subscribe(next => {
        this.getAllStartAddress();
        // this.getAllEndAddress();
        this.car = next;
        this.formUpdateCar = new FormGroup({
          id: new FormControl(this.car.id),
          idNumber: new FormControl(this.car.idNumber, [Validators.required]),
          carType: new FormControl(this.car.carType, [Validators.required]),
          houseCarName: new FormControl(this.car.houseCarName, [Validators.required]),
          startAddress: new FormControl(this.car.startAddress, [Validators.required]),
          endAddress: new FormControl(this.car.endAddress, [Validators.required]),
          phone: new FormControl(this.car.phone, [Validators.required, Validators.pattern('^((090)|(093)|(097))[0-9]{7}')]),
          email: new FormControl(this.car.email, [Validators.required, Validators.email]),
          startTime: new FormControl(this.car.startTime, [Validators.required]),
          endTime: new FormControl(this.car.endTime, [Validators.required]),
        });
      });
    });
  }

  ngOnInit(): void {

  }

  getAllStartAddress() {
    this.addressService.getAllStartAddress().subscribe(next => {
      this.startAddress = next;
    });
  }

  // getAllEndAddress() {
  //   this.addressService.getAllEndAddress().subscribe(next => {
  //     this.endAddress = next;
  //   });
  // }

  getEditCar() {
    console.log(this.formUpdateCar.value);
    this.carService.getUpdateCar(this.formUpdateCar.value).subscribe(next => {
      this.router.navigateByUrl('');
      alert(' cập nhập thành công');
    });
  }
}
