import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';


@Directive( {
selector : '[cusDir]'
})


export class CustomDir {
constructor(private el: ElementRef) {

this.el.nativeElement.style.backgroundColor = 'red';
}
@HostBinding('style.backgroundColor') backgroundColor ='yellow';
@HostListener('mouseenter') mouseEnterEvent(){
    this.el.nativeElement.style.backgroundColor = 'brown';
}
    @HostListener('mouseleave') mouseLeaveEvent(){
        this.el.nativeElement.style.backgroundColor = 'green';
    }
}
