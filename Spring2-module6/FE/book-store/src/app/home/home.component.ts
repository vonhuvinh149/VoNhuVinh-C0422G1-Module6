import {Component, OnInit} from '@angular/core';
import {ShopService} from '../Service/shop.service';
import {IBookDto} from '../model/book';
import {TokenService} from '../Service/token.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  books: IBookDto[];
  title: string = '';
  author: string = '';
  totalPage: number;
  page: number = 0;

  constructor(private shopService: ShopService, private tokenService:TokenService) {

  }

  ngOnInit(): void {
    this.getAllAndSearchBook();
  }

  getAllAndSearchBook() {

    this.page = 0;

    this.shopService.getShop(this.title, this.author, this.page).subscribe(n => {

      this.books = n.content;

      this.totalPage = n.totalPages;

    });
  }

  next() {
    this.page = this.page + 1;

    return this.shopService.getShop(this.title, this.author, this.page).subscribe(n => {

      this.books = n.content;

      this.totalPage = n.totalPage;
    });
  }

  previous() {
    this.page = this.page - 1;

    return this.shopService.getShop(this.title, this.author, this.page).subscribe(n => {

      this.books = n.content;

      this.totalPage = n.totalPage;
    });
  }
}
