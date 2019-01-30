import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http:HttpClient) { }

  getAllBooks():Observable<any>{
    return this.http.get("/aulibrary/books");
  }

  
  getBookId(id:any):Observable<any>{
    return this.http.get("/aulibrary/books/"+id);
  }
 
  
  addBook(book: any): Observable<any> {
    console.log(book);
    return this.http.post("/aulibrary/books", book);
  }
  addcart(id : any):Observable<any>{
    return this.http.post("/aulibrary/addcart/",id);
  }

  getCheckoutList(): Observable<any>{
    return this.http.get("/aulibrary/getcart");
  }

}
