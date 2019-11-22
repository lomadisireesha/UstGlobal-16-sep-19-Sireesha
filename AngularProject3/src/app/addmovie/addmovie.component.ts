import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgModel } from '@angular/forms';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {
  constructor() { }
 form = new FormGroup({
   title : new FormControl('',[Validators.required]),
   imgurl : new FormControl('',[Validators.required]),
   description : new FormControl('',[Validators.required])

 });
 
  get title() {
    return this.form.get('title');
  }
  get imgurl() {
    return this.form.get('imgurl');
  }
  get description() {
    return this.form.get('description');
  }
 

  ngOnInit() {
  }
  loginData(form:NgModel){
    console.log(form.value);
  }

}
