import {Component, OnInit} from '@angular/core';
import {ShopService} from '../Service/shop.service';
import {Book} from '../model/book';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  books: Book[];

  constructor(private shopService: ShopService) {
  }

  ngOnInit(): void {
    this.shopService.getShop().subscribe(n => {
      this.books = n;
      console.log(this.books);
    });
  }
}
