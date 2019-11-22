import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-propertybinding',
  templateUrl: './propertybinding.component.html',
  styleUrls: ['./propertybinding.component.css']
})
export class PropertybindingComponent implements OnInit {
    name : string = 'siri';
    imgurl ="https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318__340.jpg"
    address = 'Anantapur ,Papampeta'
    colorName = "yellow"
    isActive :boolean = false;
    colspanvalue =2;
  constructor() { }


  ngOnInit() {
    setInterval(()=>{
      this.colorName = 'red';
      this.isActive =! this.isActive;
    },5000);
  }

}
