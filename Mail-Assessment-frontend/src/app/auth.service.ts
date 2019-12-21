import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn: boolean;

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post('', user);
  }

  isUserLoggedIn() {
    if (this.isLoggedIn) {
      return true;
    }
    return false;
  }
}
