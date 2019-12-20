import { Component, OnInit, OnDestroy } from '@angular/core';
import { UrlsService } from '../urls.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addusers',
  templateUrl: './addusers.component.html',
  styleUrls: ['./addusers.component.css']
})
export class AddusersComponent implements OnInit , OnDestroy {

  error: string;

  constructor(private auth: UrlsService, private router: Router) { }


  register(form: NgForm) {
    this.error = null;
    this.auth.registerUser(form.value)
      .subscribe(res => {
        console.log('Response of register', res);
        if (res && res.message === 'Success') {
          localStorage.setItem('users', JSON.stringify(res));
          this.router.navigateByUrl('/login');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.message;
      });
  }
  ngOnInit() {
  }

  ngOnDestroy() {
    this.error = null;
  }


}
