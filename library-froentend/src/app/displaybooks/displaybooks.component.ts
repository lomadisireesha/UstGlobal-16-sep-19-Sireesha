import { Component, OnInit } from '@angular/core';
import { UrlsService } from '../urls.service';

@Component({
  selector: 'app-displaybooks',
  templateUrl: './displaybooks.component.html',
  styleUrls: ['./displaybooks.component.css']
})
export class DisplaybooksComponent implements OnInit {
  books: any;
  // book: any;
  search: any;
  constructor(private myService: UrlsService) {
    console.log('Hi from Products Component');
    myService.displayBook()
    .subscribe(responseData => {
      console.log('this is my data');
      console.log(responseData);
      this.books = responseData.book;
    }, error => {
      console.log(error);
    });
    console.log('subscription ended');
  }
  // searchBook(bid){
  //   this.myService.searchbook(bid).subscribe(data => {
  //     this.book = data.book;
  //     console.log(data);
  //   })
  // }

  ngOnInit() {

  }


}
