import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Component({
    selector : 'app-categories',
    templateUrl : './categories.component.html',
    styleUrls : ['./categories.component.css']
})

export class CategoriesComponent {
    news;
    input: any;
    constructor(private http: HttpClient) {
        this.getNews();
    }
    get(event) {
        this.input = event.target.value;
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=57bbe11448c14f2f8d9e7494c8e87b68&category='+this.input).subscribe(data => {
            this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('new got successfully');
    });
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=general&apiKey=57bbe11448c14f2f8d9e7494c8e87b68').subscribe(data => {
            this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('new got successfully');
    });
}
}
