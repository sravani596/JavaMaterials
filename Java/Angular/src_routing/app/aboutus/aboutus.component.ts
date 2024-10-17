import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent {



    constructor(private router:Router){

    }



    getContact(){


        // logic to navigate from about page to contact page

          this.router.navigate(['contact']);  // it implicitly route to the contact page

    }


}
