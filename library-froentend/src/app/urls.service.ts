import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UrlsService {

  constructor(private http: HttpClient) { }

  registerUser(user: any): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagementsystem/registeruser`, user);
  }
  loginUser(user: any): Observable<any> {
    return this.http.post(
      `http://localhost:8080/librarymanagementsystem/login/${user.id}/${user.password}`, user);
  }
  addBook(addBook: any): Observable<any> {

    return this.http.post(`http://localhost:8080/librarymanagementsystem/addbook`, addBook);
  }
  displayBook(): Observable<any> {

    return this.http.get(`http://localhost:8080/librarymanagementsystem/showbooks`);


  }
  request(book: any): Observable<any> {

    return this.http.post(`http://localhost:8080/librarymanagementsystem/requestingbook`, book);

  }
  viewRequest(): Observable<any> {

    return this.http.get(`http://localhost:8080/librarymanagementsystem/bookrequested`);
  }

  issuedBook(issuedbook: any): Observable<any> {

    return this.http.post(`http://localhost:8080/librarymanagementsystem/issuedbook`, issuedbook);
  }
  deletereq(books: any): Observable<any> {

    return this.http.delete<any>(`http://localhost:8080/librarymanagementsystem/deletereq/${books}` , books);

  }

  showusers(): Observable<any> {

    return this.http.get(`http://localhost:8080/librarymanagementsystem/showallusers`);


  }
  deleteuser(deluser: any): Observable<any> {

    return this.http.delete<any>(`http://localhost:8080/librarymanagementsystem/deleteuser/${deluser}` , deluser);
  }
}
