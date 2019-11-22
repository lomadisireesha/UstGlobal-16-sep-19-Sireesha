import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngif',
  templateUrl: './ngif.component.html',
  styleUrls: ['./ngif.component.css']
})
export class NgifComponent implements OnInit {

  constructor() { }
   showOrHide = false;
  ngOnInit() {
    setTimeout(() => {
      this.showOrHide = true;
    }, 2000 )
  }
}

