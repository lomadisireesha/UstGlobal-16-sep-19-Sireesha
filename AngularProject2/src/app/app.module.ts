import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule , ReactiveFormsModule} from '@angular/forms';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchComponent } from './search/search.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'header' , component : HeaderComponent},
      {path : 'countries' , component : CountriesComponent},
      {path : 'categories' , component : CategoriesComponent},
      {path : 'sources' , component : SourcesComponent},
      {path : 'search' , component : SearchComponent},
      {path : 'home' , component : HomeComponent},





  ]),
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
