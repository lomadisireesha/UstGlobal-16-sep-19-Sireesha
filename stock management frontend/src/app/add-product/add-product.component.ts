import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  constructor(private http: HttpClient, private service: AuthService, private router: Router ) { }

  addProduct(addProductForm: NgForm) {
    console.log(addProductForm.value);
    this.http.post(`${this.service.baseURL}/add`, addProductForm.value).subscribe(response => {
    if (response != null) {
      alert('Product Added');
      this.router.navigate(['/display']);
    } else {
      alert('Failed to add Product');
    }
    });
  }
  ngOnInit() {
  }

}
