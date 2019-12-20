import { Component, OnInit } from '@angular/core';
import { UrlsService } from '../urls.service';

@Component({
  selector: 'app-displayusers',
  templateUrl: './displayusers.component.html',
  styleUrls: ['./displayusers.component.css']
})
export class DisplayusersComponent implements OnInit {
  search: any;
  user: any;
  error: any;
  constructor(private myService: UrlsService) {
    myService.showusers()
      .subscribe(responseData => {
        console.log('this is my data');
        console.log(responseData);
        this.user = responseData.users;
      }, error => {
        console.log(error);
      });
  }
  delete(id: any) {
    this.myService.deleteuser (id).subscribe(data => {

      console.log(id);

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
