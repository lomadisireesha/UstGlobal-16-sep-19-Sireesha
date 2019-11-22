import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';



@Component({
    selector : 'app-movies',
    templateUrl : './movies.component.html',
    styleUrls : ['./movies.component.css']
})

export class MoviesComponent {
  input: any;
  news: any;
 
    constructor(private http: HttpClient) {
    }
    get(event) {
        this.input = event.target.value;
        this.http.get<any>('http://www.omdbapi.com/?apikey=7035118d&s='+this.input).subscribe(data => {
            this.news = data.Search;
    }, err => {
        console.log(err);
    }, () => {
        console.log('new got successfully');
    });
    }
}
