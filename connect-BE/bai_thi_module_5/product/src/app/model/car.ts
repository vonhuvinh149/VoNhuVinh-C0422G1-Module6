import {StartAddress} from './startAddress';
import {EndtAddress} from './endAddress';
import {CarType} from './carType';

export interface Car {
  id?: number;
  idNumber?: string;
  carType?: CarType;
  houseCarName?: string;
  startAddress?: StartAddress;
  endAddress?: EndtAddress;
  phone?: string;
  email?: string;
  startTime?: string;
  endTime?: string;
}
