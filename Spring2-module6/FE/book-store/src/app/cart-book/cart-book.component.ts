import {Component, OnInit} from '@angular/core';
import {ShopService} from '../Service/shop.service';
import { ICartDto} from '../model/cart';

@Component({
  selector: 'app-cart-book',
  templateUrl: './cart-book.component.html',
  styleUrls: ['./cart-book.component.css']
})
export class CartBookComponent implements OnInit {

  cart: ICartDto[] ;

  constructor(private shopService: ShopService) {
    this.getCart();
  }

  ngOnInit(): void {

  }

  getCart() {
  }
}
