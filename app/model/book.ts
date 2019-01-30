export class Book {
    id: number;
  bookName: string;
  authorName: string;
  price: number;
  description: string;

  constructor(id, bookName, authorName, price, description) {
    this.id = id;
    this.bookName = bookName;
    this.authorName = authorName;
    this.price = price;
    this.description = description;
  }
}
