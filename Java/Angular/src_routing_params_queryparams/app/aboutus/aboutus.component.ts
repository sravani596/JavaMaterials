import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Action } from 'rxjs/internal/scheduler/Action';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent {

     customerName:string ="";

    constructor(private router:Router,private route:ActivatedRoute){

      this.route.params.subscribe( (inputs)=>{  this.customerName = inputs['name'] });

    }






    getContact(){


        // logic to navigate from about page to contact page

          this.router.navigate(['contact']);  // it implicitly route to the contact page

    }


}
