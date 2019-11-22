import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      name : 'Ambasidor',
      ingUrl : 'https://cdn.pixabay.com/photo/2018/05/03/08/52/auto-3370706__340.jpg'
    },
    {
      name : 'BMW',
      ingUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg'
    },
    {
      name : 'BENZ',
      ingUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    this.selectedCar = car;
    // console.log(car);
  }

}
