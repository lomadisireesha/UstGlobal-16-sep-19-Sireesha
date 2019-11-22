import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  products = [
    {
      img: 'https://cdn.pixabay.com/photo/2018/03/22/02/37/background-3249063__340.png',
      name : 'camera',
      price : '1050'
    },
    {
      img : 'https://cdn.pixabay.com/photo/2017/02/15/11/42/t-shirt-2068353__340.png',
      name : 'shirt',
      price : '500'
    },
  ]

  constructor() { }

  ngOnInit() {
  }

}
