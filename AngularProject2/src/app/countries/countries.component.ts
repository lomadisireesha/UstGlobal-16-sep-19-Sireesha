import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Component({
    selector : 'app-countries',
    templateUrl : './countries.component.html',
    styleUrls : ['./countries.component.css']
})

export class CountriesComponent {
    news;
    input: any;
    constructor(private http: HttpClient) {
        this.getNews();
    }
    get(event) {
        this.input = event.target.value;
        this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=57bbe11448c14f2f8d9e7494c8e87b68&country='+this.input).subscribe(data => {
            this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('new got successfully');
    });
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=57bbe11448c14f2f8d9e7494c8e87b68').subscribe(data => {
            this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('new got successfully');
    });
}
}
