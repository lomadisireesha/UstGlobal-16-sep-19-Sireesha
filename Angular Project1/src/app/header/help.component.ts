import { Component, ɵCompiler_compileModuleAndAllComponentsAsync__POST_R3__ } from '@angular/core';




@Component({
      selector : 'app-help',
      templateUrl : './help.component.html',
      styleUrls : ['./help.component.css']
})

export class HelpComponent {
    
    colorName ='brown';
    color = 'orange';
     isActive = false ;
constructor() { 
      setInterval(()=>{
this.isActive =! this.isActive;
      },2000)
}
 }
