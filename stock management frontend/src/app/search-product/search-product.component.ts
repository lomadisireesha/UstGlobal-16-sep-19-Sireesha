import { Component, OnInit } from '@angular/core';
import { ProductResponse } from '../ProductResponse';
import { HttpClient } from '@angular/common/http';

import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {
  productData: ProductResponse;
  constructor(private http: HttpClient,
              private service: AuthService) { }

  

  ngOnInit() {
  }

  getProductInfo(deleteProduct: NgForm) {
    this.http.get<ProductResponse>(`${this.service.baseURL}/search/${deleteProduct.value.pid}`,  {headers: this.service.header})
      .subscribe(response => {
        if (response != null) {
          
        } else {
          alert('No Product Data Present for ID ' + deleteProduct.value.pid);
        }
        this.productData = response;
        console.log(response);
      });
  }

}
