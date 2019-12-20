import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AddbookComponent } from './addbook/addbook.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { DisplaybookComponent } from './displaybook/displaybook.component';
import { ReturnbookComponent } from './returnbook/returnbook.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    RegisterComponent,
    LoginComponent,
    AddbookComponent,
    IssuebookComponent,
    RequestbookComponent,
    ReturnbookComponent,
    DisplaybookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path: 'home', component: HomeComponent},
      { path: 'register', component: RegisterComponent },
      { path: 'login', component: LoginComponent },
      { path: 'addbook', component: AddbookComponent },
      { path: 'issuebook', component: IssuebookComponent },
      { path: 'requestbook', component: RequestbookComponent },
      { path: 'returnbook', component: ReturnbookComponent },
      { path: 'displaybook', component: DisplaybookComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
