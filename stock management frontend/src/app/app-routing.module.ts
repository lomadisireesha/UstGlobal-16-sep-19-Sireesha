import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { DisplayProductsComponent } from './display-products/display-products.component';
import { SearchProductComponent } from './search-product/search-product.component';
import { DisplayProductnameComponent } from './display-productname/display-productname.component';


const routes: Routes = [
  {path: 'add' ,  component : AddProductComponent},
  {path: 'display' , component : DisplayProductsComponent},
  {path: 'search' , component : SearchProductComponent},
  {path: 'searchbyname' , component : DisplayProductnameComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
