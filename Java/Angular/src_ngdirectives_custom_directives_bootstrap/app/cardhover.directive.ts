import { Directive , ElementRef, HostListener, Renderer2} from '@angular/core';

@Directive({
  selector: '[cardhover]'
})
export class CardhoverDirective {



  constructor(private e1:ElementRef, private renderer:Renderer2) {


   }

   @HostListener('mouseover')
   onMouseOver(){

        this.renderer.setStyle(this.e1.nativeElement , 'background-color','green')

       //  alert('mouseover is on textcontext bg color changed');

   }



}
