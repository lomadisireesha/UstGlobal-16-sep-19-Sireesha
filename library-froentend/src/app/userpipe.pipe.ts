import { Pipe, PipeTransform } from '@angular/core';
import { Users } from './users';

@Pipe({
  name: 'userpipe'
})
export class UserpipePipe implements PipeTransform {


  transform( disuser: Users[], search: string): any {

    if (search === undefined) {
      return disuser;
    } else {

      return disuser.filter((value, index, arry) => value.name.toLowerCase().includes(search.toLowerCase()));
    }

  }

}
