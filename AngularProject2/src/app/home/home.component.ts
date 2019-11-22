import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
entNews;
topNews;
sptNews;
  constructor(private http:HttpClient) { 
    this.getEntNews();
    this.getTopNews();
    this.getSptNews();
  }
  getEntNews(){
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=57bbe11448c14f2f8d9e7494c8e87b68').subscribe(data => {
            this.entNews = data.articles;
            console.log(data);
    }, err => {
        console.log(err);
    }, () => {
        console.log('top new got successfully');
    });
    }
    getTopNews(){
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=57bbe11448c14f2f8d9e7494c8e87b68').subscribe(data => {
          this.topNews = data.articles;
          console.log(data);
  }, err => {
      console.log(err);
  }, () => {
      console.log('new got successfully');
  });
  }
  getSptNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=57bbe11448c14f2f8d9e7494c8e87b68').subscribe(data => {
        this.sptNews = data.articles;
        console.log(data);
}, err => {
    console.log(err);
}, () => {
    console.log('new got successfully');
});
}

  


ngOnInit() {
  }
}

