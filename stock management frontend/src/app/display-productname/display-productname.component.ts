import { Component, OnInit } from '@angular/core';
import { ProductResponse } from '../ProductResponse';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-display-productname',
  templateUrl: './display-productname.component.html',
  styleUrls: ['./display-productname.component.css']
})
export class DisplayProductnameComponent implements OnInit {
  productData: ProductResponse;
  constructor(private http: HttpClient,
              private service: AuthService) { }



  ngOnInit() {
  }

  getProductInfo(deleteProduct: NgForm) {
    this.http.get<ProductResponse>(`${this.service.baseURL}/searchbyName/${deleteProduct.value.pname}`,  {headers: this.service.header})
      .subscribe(response => {
        if (response != null) {

        } else {
          alert('No Product Data Present for ID ' + deleteProduct.value.pname);
        }
        this.productData = response;
        console.log(response);
      });
  }

}
