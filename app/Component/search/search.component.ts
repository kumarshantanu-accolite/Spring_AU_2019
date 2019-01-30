import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  books:any=[];
  id:any=[];
  constructor(private bookService:BookService) { }

  ngOnInit() {
    this.bookService.getAllBooks().subscribe((response)=>{
      if(response && response.length>0)
    {
      this.books=response;
    }
    
 
       
     });
  
  }
  showData() {
    console.log(this.id);
    this.bookService.getBookId(this.id).subscribe(response => {
      if (response) {
        this.books = response;
      }
    });
    console.log(this.books);
  }


}
