import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule , ReactiveFormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { MoviesComponent } from './movies/movies.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    AddmovieComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'header' , component : HeaderComponent},
      {path : 'movies' , component : MoviesComponent},
      {path : 'add' , component : AddmovieComponent},
      {path : 'login' , component : LoginComponent},
      


    
  
    ]),
  ],
    providers: [],
    bootstrap: [AppComponent]
  })
  export class AppModule { }

