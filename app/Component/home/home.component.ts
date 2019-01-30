import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';
import { Checkout } from 'src/app/model/checkout';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
   books:any=[];
   AllBooks: any = [];
  id: number;
  bookName: string;
  authorName: string;
  price: number;
  description: string;
  constructor(private bookService:BookService) { }

  ngOnInit() {
   this.bookService.getAllBooks().subscribe((response)=>{
     if(response && response.length>0)
   {
     this.books=response;
   }});
  }
   postData(){
    const book = new Book(
      this.id,
      this.bookName,
      this.authorName,
      this.price,
      this.description
    );
    this.bookService.addBook(book).subscribe(response => {
      console.log(response);
    });
      
  }


  checkOut(id : any){
    this.bookService.addcart(new Checkout(id,"name")).subscribe();
  }
}
