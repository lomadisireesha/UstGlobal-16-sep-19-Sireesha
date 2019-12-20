import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard {

  isALoggedIn = false;
  isLLoggedIn = false;
  isSLoggedIn = false;
  home = true;

  isAdmin() {
    if (this.isALoggedIn) {
      return true;
    } else {
      return false;
    }
  }
  isLibrarian() {
    if (this.isLLoggedIn) {
      return true;
    } else {
      return false;
    }
  }

  isStudent() {
    if (this.isSLoggedIn) {
      return true;
    } else {
      return false;
    }

  }
}
