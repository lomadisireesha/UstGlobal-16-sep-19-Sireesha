import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  baseURL = 'http://localhost:8080';
  header = new HttpHeaders({'content-type': 'application/json'}); 
  
  constructor(private http: HttpClient) { }

}
