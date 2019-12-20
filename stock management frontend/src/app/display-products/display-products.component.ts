import { Component, OnInit } from '@angular/core';
import { ProductResponse } from '../ProductResponse';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-display-products',
  templateUrl: './display-products.component.html',
  styleUrls: ['./display-products.component.css']
})
export class DisplayProductsComponent implements OnInit {
  products: ProductResponse;
  constructor(private service: AuthService,
              private http: HttpClient) {
     this.getData();
   }

   ngOnInit() {
   }
   getData() {
       this.http.get<ProductResponse>(
         `${this.service.baseURL}/getAll`,  {headers: this.service.header}
         ).subscribe(response => {
       this.products = response;
       console.log(this.products);
     });
   }

}
