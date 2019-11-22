import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Component({
    selector : 'app-search',
    templateUrl : './search.component.html',
    styleUrls : ['./search.component.css']
})

export class SearchComponent {
  input: any;
  news: any;
 
    constructor(private http: HttpClient) {
        this.get(event);
    }
    get(event) {
        this.input = event.target.value;
        this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=57bbe11448c14f2f8d9e7494c8e87b68&q='+this.input).subscribe(data => {
            this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('new got successfully');
    });
    }
}
