import { Component, OnInit } from '@angular/core';
import { UrlsService } from '../urls.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-issuedbook',
  templateUrl: './issuedbook.component.html',
  styleUrls: ['./issuedbook.component.css']
})
export class IssuedbookComponent implements OnInit {

  error: any;
  constructor(private auth: UrlsService, private router: Router) { }

  requestBook(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.issuedBook(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.message === 'Success') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        alert('issued book successfully');
        alert(data.bookissue[0]);
        this.router.navigateByUrl(`/`);
      }
      form.reset();
    }, err => {

      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
