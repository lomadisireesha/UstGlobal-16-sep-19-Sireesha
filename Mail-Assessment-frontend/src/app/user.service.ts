import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
})

export class UserService {

    constructor(private http: HttpClient) {}

    composeEmail(email): Observable<any> {
       return this.http.post('', email);
    }

    changePassword(password): Observable<any> {
        return this.http.post('', password);
    }

    deleteEmail(email): Observable<any> {
        return this.http.delete('', email);
    }
}
