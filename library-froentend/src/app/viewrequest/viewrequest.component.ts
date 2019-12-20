import { Component, OnInit } from '@angular/core';
import { UrlsService } from '../urls.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewrequest',
  templateUrl: './viewrequest.component.html',
  styleUrls: ['./viewrequest.component.css']
})
export class ViewrequestComponent implements OnInit {
  books: any;
  error: any;
  constructor(private myService: UrlsService, private router: Router) {
    console.log('Hi from Products Component');
    myService.viewRequest()
      .subscribe(responseData => {
        console.log('this is my data');
        console.log(responseData);
        this.books = responseData;
      }, error => {
        console.log(error);
      });
    console.log('subscription ended');
  }
  delete(bookid: any) {
    this.myService.deletereq(bookid).subscribe(data => {

      console.log(bookid);

      if (data != null) {
        console.log(data);
      } else {
        alert('failed to delete');
      }
    }, err => {

      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
