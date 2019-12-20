import { Pipe, PipeTransform } from '@angular/core';
import { book } from './book';

@Pipe({
  name: 'pipe'
})
export class PipePipe implements PipeTransform {
  transform(books: book[], search: string): any {

    if (search === undefined) {
      console.log(books);
      return books;
    } else {
      return books.filter((value, index, arry) => value.bname.toLowerCase().includes(search.toLowerCase()));
    }
  }

}


