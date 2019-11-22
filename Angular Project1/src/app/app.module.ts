import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from  '@angular/common/http';
import { AppComponent } from './app.component';
import { headersToString } from 'selenium-webdriver/http';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home.component';
import { AboutComponent } from './header/about.component';
import { LoginComponent } from './header/login.component';
import { HelpComponent } from './header/help.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { PropertybindingComponent } from './databinding/propertybinding/propertybinding.component';
import { EventbindingComponent } from './databinding/eventbinding/eventbinding.component';
import { TwowayComponent } from './databing/twoway/twoway.component';
import { StructuralComponent } from './directive/structural/structural.component';
import { NgifComponent } from './directive/structural/ngif/ngif.component';
import { NgforComponent } from './directive/structural/ngfor/ngfor.component';
import { NgSwitchComponent } from './directive/structural/ng-switch/ng-switch.component';
import { NgSwitch } from '@angular/common';
import {CustomDir} from './custom.directive';
import { RegisterComponent } from './register/register.component'
import { Form2Component } from './form2/form2.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent ,
    AboutComponent ,
    LoginComponent ,
    HelpComponent,
    FooterComponent,
    DatabindingComponent,
    PropertybindingComponent,
    EventbindingComponent,
    TwowayComponent,
    StructuralComponent,
    NgifComponent,
    NgforComponent,
    NgSwitchComponent,
    CustomDir,
    RegisterComponent,
    Form2Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
RouterModule.forRoot([
  {path : '' , component : HomeComponent },
  {path : 'about' , component : AboutComponent},
  {path : 'help' , component :  HelpComponent},
  {path : 'property binding' , component : PropertybindingComponent},
  {path : 'event binding' , component : EventbindingComponent},
  {path : 'two-way' , component : TwowayComponent},
  {path : 'ng-if' , component : NgifComponent},
  {path : 'ng-for' , component : NgforComponent},
  {path : 'ngswitch' , component : NgSwitchComponent},
  {path : 'register' , component : RegisterComponent},
  {path : 'form2' , component : Form2Component},
  {path : 'reactiveform' , component : ReactiveFormComponent},
  {path : 'parent' , component :ParentComponent },
  {path : 'comment-details' , component: CommentDetailsComponent}
])  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
